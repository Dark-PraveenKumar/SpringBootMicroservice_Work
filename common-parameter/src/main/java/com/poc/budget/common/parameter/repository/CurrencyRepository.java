package com.poc.budget.common.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long>{

	@Query("SELECT c FROM Currency c where c.id= :id")
	public Currency findCurrencyById(@Param("id") long id);
}
