package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Costcenter;

@Repository
public interface CostcenterRepository extends JpaRepository<Costcenter, Integer> {
	
	@Query("select * from Costcenter cc where cc.SiteName= :id")
	public List<Costcenter> getCostCenterBySite(@Param("id") long id);
}
