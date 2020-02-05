package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.WorkEffort;




@Repository
public interface WorkEffortRepository extends JpaRepository<WorkEffort, Long>{

	@Query("SELECT we FROM WorkEffort we WHERE we.parentEffort.effortId= :effortId and we.description like 'WBS'")
	public List<WorkEffort> findWBSByProgram(@Param("effortId") String effortId);
	
	@Query(value = "select * from work_effort where id in (select work_effort_id from business_Work_effort_link where business_id = ?1 and description like 'program') ",nativeQuery = true)
	public List<WorkEffort> findProgramByBusiness(long business_id);
}
