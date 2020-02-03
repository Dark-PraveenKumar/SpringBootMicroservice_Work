package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.model.WorkEffortModel;

public interface WorkEffortService {

	//public WorkEffort createWorkEffort(WorkEffort workEffort);
	
	public List<WorkEffortModel> getWBSForProgram(String effortId);
}
