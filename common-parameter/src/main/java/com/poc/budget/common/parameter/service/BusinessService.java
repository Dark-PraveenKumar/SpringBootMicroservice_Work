package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.Business;

public interface BusinessService {

	public List<Business> getAllBusiness();
	
	public List<Business> getSubBusiness(long id);
}
