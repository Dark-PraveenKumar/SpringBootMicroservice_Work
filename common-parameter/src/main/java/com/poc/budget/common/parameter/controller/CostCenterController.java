package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.Costcenter;
import com.poc.budget.common.parameter.service.CostCenterService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/costcenter")
public class CostCenterController {

	@Autowired
	private CostCenterService costcenterservice;

	@Operation(summary = "Get CostCenter based on site id")
	@GetMapping("/getCostCenterBySite/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public List<Costcenter> getCostCenterBySite(@PathVariable int id) {
		return costcenterservice.getCostCenterBySite(id);
	}

	
	
}
