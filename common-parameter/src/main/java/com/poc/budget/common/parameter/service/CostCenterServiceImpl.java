package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.Costcenter;
import com.poc.budget.common.parameter.repository.CostcenterRepository;

@Service
public class CostCenterServiceImpl implements CostCenterService {

	@Autowired
	private CostcenterRepository costcenterrepository;
	
	@Override
	public List<Costcenter> getCostCenterBySite(int Id) {
		return costcenterrepository.findAll();
	}

	
	
	
	
}
