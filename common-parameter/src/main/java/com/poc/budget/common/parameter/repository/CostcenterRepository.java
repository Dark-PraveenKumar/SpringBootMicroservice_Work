package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Costcenter;

@Repository
public interface CostcenterRepository extends JpaRepository<Costcenter, Integer> {
	
	@Query(value = "select * from Costcenter cc where cc.id in (select sc.costcenter_id from Site_Costcenter_link where sc.site_id= :id)",nativeQuery = true)
	public List<Costcenter> getCostCenterBySite(@Param("id") long id);
	
	@Query("select cc from Costcenter cc where cc.id= :id")
	public Costcenter findCostCenterById(@Param("id") long id);
}
