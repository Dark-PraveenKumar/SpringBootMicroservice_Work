package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.Costcenter;

public interface CostCenterService {

	public List<Costcenter> getCostCenterBySite(int Id);
	
}
