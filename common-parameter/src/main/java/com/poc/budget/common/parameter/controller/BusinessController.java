package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.Business;
import com.poc.budget.common.parameter.service.BusinessService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/business")
public class BusinessController {
	
	@Autowired
	private BusinessService businessservice;
	
	@Operation(summary = "Get All Business")
	@GetMapping("/getAllBusiness")
	@Produces("application/json")
	@Consumes("application/json")
	public List<Business> getAllBusiness(){
		return businessservice.getAllBusiness();
	}

	@Operation(summary = "Get Business for given site")
	@GetMapping("/getSubBusiness/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public List<Business> getSubBusiness(@PathVariable long id){
		return businessservice.getSubBusiness(id);
	}
}
