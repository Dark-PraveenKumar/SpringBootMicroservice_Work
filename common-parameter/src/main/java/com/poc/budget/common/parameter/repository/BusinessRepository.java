package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer>{
	
	@Query("select b from Business b where b.ParentUnit.id= :id")
	public List<Business> getSubBusiness(@Param("id") long id);
	
	@Query("select b from Business b where b.ParentUnit is null")
	public List<Business> getAllBusiness();
	
	@Query("select b from Business b where b.id= :id")
	public Business findBusinessById(@Param("id") long id);
	

}
