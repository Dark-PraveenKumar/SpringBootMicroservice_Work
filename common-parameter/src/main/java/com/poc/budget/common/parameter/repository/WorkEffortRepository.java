package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.WorkEffort;




@Repository
public interface WorkEffortRepository extends JpaRepository<WorkEffort, Long>{

	@Query("SELECT we FROM WorkEffort we WHERE we.parentEffort.effortId= :effortId")
	public List<WorkEffort> findWBSByProgram(@Param("effortId") String effortId);
}
