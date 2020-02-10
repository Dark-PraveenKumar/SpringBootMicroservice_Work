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
import com.poc.budget.common.parameter.service.ProductDataService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/product")
public class ProductDataController {

	@Autowired
	ProductDataService productDataService;
	
	@Operation(summary = "Create ProductData")
	@PostMapping("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody ProductData createAccount(@RequestBody ProductData productData) {
		ProductData result = productDataService.createProductData(productData);
		return result;
	}
	
	@Operation(summary = "Get product Details for the product code search string")
	@GetMapping("/getProductDataByCode/{search}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<ProductData> getProductDataByCode(@PathVariable String search) {
	List<ProductData> result = productDataService.getProductDataByCode(search);
	return result;
	}
	
	@Operation(summary = "Get product Details for the product name search string")
	@GetMapping("/getProductDataByName/{search}")
	@Produces("application/json")
	@Consumes("application/json")
	public List<ProductData> getProductDataByName(@PathVariable String search) {
	List<ProductData> result = productDataService.getProductDataByName(search);
	return result;
	}
	
	@Operation(summary = "Get product Details for the product id")
	@GetMapping("/getProductDataById/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public ProductData getProductDataByid(@PathVariable long id) {
	ProductData result = productDataService.getProductDataById(id);
	return result;
	}
}
	
	

