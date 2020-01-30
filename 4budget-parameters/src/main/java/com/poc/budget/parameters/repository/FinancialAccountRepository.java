package com.poc.budget.parameters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.parameters.entity.FinancialAccount;

@Repository
public interface FinancialAccountRepository extends JpaRepository<FinancialAccount, Long>{

	
	@Query("SELECT fa FROM FinancialAccount fa WHERE fa.id= :id")
	public FinancialAccount findByFinancialAccountId(@Param("id") long id);
	
	@Query("SELECT fa FROM FinancialAccount fa WHERE fa.typeFlag= 1")
	public List<FinancialAccount> findAllFixedAccounts();
	
	@Query("SELECT fa FROM FinancialAccount fa WHERE fa.typeFlag= 0")
	public List<FinancialAccount> findAllInvestmentAccounts();
	
	@Query("SELECT fa FROM FinancialAccount fa WHERE fa.typeFlag= 2")
	public List<FinancialAccount> findAllLowValueAccounts();
}
