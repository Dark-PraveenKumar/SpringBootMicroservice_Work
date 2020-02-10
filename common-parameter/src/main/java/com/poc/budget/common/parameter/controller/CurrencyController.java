package com.poc.budget.common.parameter.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.Currency;
import com.poc.budget.common.parameter.service.CurrencyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/currency")
public class CurrencyController {

	@Autowired
	CurrencyService currencyService;
	
	@Operation(summary = "Get Currency based on id")
	@GetMapping("/getCurrencyById/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public Currency getCurrencyByid(@PathVariable long id) {
		Currency result = currencyService.getCurrencyById(id);
		return result;
	}
}
