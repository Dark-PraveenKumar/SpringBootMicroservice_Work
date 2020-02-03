package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.model.WorkEffortModel;



@Repository
public interface WorkEffortRepository extends JpaRepository<WorkEffortModel, Long>{

	@Query("SELECT we FROM WorkEffort we WHERE we.parentEffort.effortId= :effortId")
	public List<WorkEffortModel> findWBSByProgram(@Param("effortId") String effortId);
}
