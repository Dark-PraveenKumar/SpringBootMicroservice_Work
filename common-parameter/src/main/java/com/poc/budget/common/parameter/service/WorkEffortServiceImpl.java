package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.model.WorkEffortModel;
import com.poc.budget.common.parameter.repository.WorkEffortRepository;

@Service
public class WorkEffortServiceImpl implements WorkEffortService{

	@Autowired
	WorkEffortRepository workEffortRepository;

	@Override
	public List<WorkEffortModel> getWBSForProgram(String effortId) {
		// TODO Auto-generated method stub
		return workEffortRepository.findWBSByProgram(effortId);
	}
	
	
}
