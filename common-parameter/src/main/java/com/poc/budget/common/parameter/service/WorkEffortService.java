package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.WorkEffort;


public interface WorkEffortService {

	//public WorkEffort createWorkEffort(WorkEffort workEffort);
	
	public List<WorkEffort> getWBSForProgram(String effortId);
	public List<WorkEffort> getProgramForBusiness(long BusinessId);
	
	public WorkEffort getWorkEffortById(long id);
}
