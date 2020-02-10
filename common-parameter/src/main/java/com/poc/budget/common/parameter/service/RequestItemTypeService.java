package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.RequestItemType;

@Repository
public interface RequestItemTypeService {
	
	public List<RequestItemType> getAllItemTypes();
	
	public RequestItemType createRequestItemType(RequestItemType requestItemType);
	
	public RequestItemType getRequestItemTypeByid(long id);
}
