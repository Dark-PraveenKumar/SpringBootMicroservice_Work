package com.poc.budget.requestservice.service;

import com.poc.budget.requestservice.entity.Request;
import com.poc.budget.requestservice.model.RequestDetails;

public interface RequestService {

	public Request createRequest(Request request); 
	
	public Request getRequestById(long id);
	
	public RequestDetails getByRequestId(long id);
}
