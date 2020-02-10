package com.poc.budget.requestservice.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.requestservice.entity.Request;
import com.poc.budget.requestservice.model.RequestDetails;
import com.poc.budget.requestservice.service.RequestService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "request-service", description = ": API")
@RequestMapping("/4budget/api/requestservice")
public class RequestController {

	@Autowired
	RequestService requestService;
	
	@Operation(summary = "Get Request based on id")
	@GetMapping("/getRequestById/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public Request getRequestById(@PathVariable long id){
		return requestService.getRequestById(id);
	}
	
	@Operation(summary = "create request")
	@PostMapping("create")
	@Produces("application/json")
	@Consumes("application/json")
	public Request createRequest(@RequestBody Request request) {
		return requestService.createRequest(request);
	}
	
	@Operation(summary = "Get Request details based on id")
	@GetMapping("/getByRequestId/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public RequestDetails getByRequestId(@PathVariable long id){
		return requestService.getByRequestId(id);
	}
}

