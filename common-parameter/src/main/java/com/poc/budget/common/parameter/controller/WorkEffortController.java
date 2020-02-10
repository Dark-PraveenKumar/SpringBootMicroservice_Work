package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.WorkEffort;
import com.poc.budget.common.parameter.service.WorkEffortService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/workeffort")
public class WorkEffortController {

	@Autowired
	WorkEffortService workEffortService;
	
	@Operation(summary = "Get WorkEffort")
	@GetMapping("/getWbsForProgram/{effortId}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<WorkEffort> getWBSForProgram(@PathVariable String effortId) {
	List<WorkEffort> result = workEffortService.getWBSForProgram(effortId);
	return result;
	}
	
	
	@Operation(summary = "Get Program by Business")
	@GetMapping("/getProgramForBusiness/{BusinessId}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<WorkEffort> getProgramForBusiness(@PathVariable long BusinessId) {
	List<WorkEffort> result = workEffortService.getProgramForBusiness(BusinessId);
	return result;
	}
	
	@Operation(summary = "Get WorkEffort By id")
	@GetMapping("/getWorkEffortById/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody WorkEffort getWorkEffortById(@PathVariable long id) {
	WorkEffort result = workEffortService.getWorkEffortById(id);
	return result;
	}
}
