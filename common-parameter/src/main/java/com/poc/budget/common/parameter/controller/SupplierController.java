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

import com.poc.budget.common.parameter.entity.Supplier;
import com.poc.budget.common.parameter.service.SupplierService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@Operation(summary = "Create supplier")
	@PostMapping("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody Supplier createSupplier(@RequestBody Supplier supplier) {
		Supplier result = supplierService.createSupplier(supplier);
		return result;
		
	}
	
	@Operation(summary = "Get suggestive suppliers")
	@GetMapping("/getSuggestiveSuppliers/{search}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<Supplier> getSuggestiveSuppliers(@PathVariable String search) {
	List<Supplier> result = supplierService.getSuggestiveSuppliers(search);
	return result;
	}
	
}
