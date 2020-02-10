package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.ProductData;

public interface ProductDataService {

	public List<ProductData> getProductDataByCode(String search);
	
	public List<ProductData> getProductDataByName(String search);
	
	public ProductData createProductData(ProductData productData);
	
	public ProductData getProductDataById(long id);
}
