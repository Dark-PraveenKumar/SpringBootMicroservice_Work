package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.WorkEffort;
import com.poc.budget.common.parameter.repository.WorkEffortRepository;

@Service
public class WorkEffortServiceImpl implements WorkEffortService{

	@Autowired
	WorkEffortRepository workEffortRepository;

	@Override
	public List<WorkEffort> getWBSForProgram(String effortId) {
		// TODO Auto-generated method stub
		return workEffortRepository.findWBSByProgram(effortId);
		//return workEffortRepository.findProgramForBusiness(2641);
	}
	
	@Override
	public List<WorkEffort> getProgramForBusiness(long BusinessId) {
		// TODO Auto-generated method stub
		return workEffortRepository.findProgramByBusiness(BusinessId);
		//return workEffortRepository.findProgramForBusiness(2641);
	}

	@Override
	public WorkEffort getWorkEffortById(long id) {
		// TODO Auto-generated method stub
		return workEffortRepository.findWorkEffortById(id);
	}
}
