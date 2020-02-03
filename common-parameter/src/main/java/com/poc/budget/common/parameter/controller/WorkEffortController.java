package com.poc.budget.common.parameter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.model.WorkEffortModel;
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
	public List<WorkEffortModel> getWBSForProgram(@PathVariable String effortId) {
	List<WorkEffortModel> result = workEffortService.getWBSForProgram(effortId);
	return result;
	}
}
