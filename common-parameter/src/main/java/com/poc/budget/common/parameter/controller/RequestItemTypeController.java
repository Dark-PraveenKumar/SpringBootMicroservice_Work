package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.ProductData;
import com.poc.budget.common.parameter.entity.RequestItemType;
import com.poc.budget.common.parameter.service.RequestItemTypeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/requestItemtype")
public class RequestItemTypeController {
	
	@Autowired
	RequestItemTypeService requestItemTypeService;
	
	@Operation(summary = "Create requestItemType")
	@PostMapping("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody RequestItemType createRequestItemType(@RequestBody RequestItemType requestItemType) {
		RequestItemType result = requestItemTypeService.createRequestItemType(requestItemType);
		return result;
	}
	
	@Operation(summary = "Get all requestItemTypes")
	@GetMapping("/getAllRequestItemTypes")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<RequestItemType> getAllRequestItemType() {
	List<RequestItemType> result = requestItemTypeService.getAllItemTypes();
	return result;
	}
}
