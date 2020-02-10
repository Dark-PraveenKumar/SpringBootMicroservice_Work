package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.Business;
import com.poc.budget.common.parameter.repository.BusinessRepository;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessrepository;

	@Override
	public List<Business> getAllBusiness() {
		return businessrepository.getAllBusiness();
	}

	@Override
	public List<Business> getSubBusiness(long id) {
		return businessrepository.getSubBusiness(id);
	}

	@Override
	public Business getBusinessById(long id) {
		// TODO Auto-generated method stub
		return businessrepository.findBusinessById(id);
	}

}
