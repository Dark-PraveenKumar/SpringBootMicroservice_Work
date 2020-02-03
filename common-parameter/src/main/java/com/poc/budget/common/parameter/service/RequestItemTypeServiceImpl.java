package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.RequestItemType;
import com.poc.budget.common.parameter.repository.RequestItemTypeRepository;

@Service
public class RequestItemTypeServiceImpl implements RequestItemTypeService{

	@Autowired
	public RequestItemTypeRepository requestItemTypeRepository;
	
	@Override
	public List<RequestItemType> getAllItemTypes() {
		// TODO Auto-generated method stub
		return requestItemTypeRepository.findAll();
	}

	@Override
	public RequestItemType createRequestItemType(RequestItemType requestItemType) {
		// TODO Auto-generated method stub
		return requestItemTypeRepository.save(requestItemType);
	}

}
