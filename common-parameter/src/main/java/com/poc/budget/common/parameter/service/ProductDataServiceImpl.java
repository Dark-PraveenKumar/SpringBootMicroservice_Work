package com.poc.budget.common.parameter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.ProductData;
import com.poc.budget.common.parameter.repository.ProductDataRepository;

@Service
public class ProductDataServiceImpl implements ProductDataService{

	@Autowired
	ProductDataRepository productDataRepository;
	
	@Override
	public List<ProductData> getProductDataByCode(String search) {
		List<ProductData> productList = new ArrayList<ProductData>();
		if(search==null || search.length() == 0)
			return productList;
		else {
			//search = "%" + search + "%"; 
			productList = productDataRepository.findProductDataByCode(search);
			return productList;
		}
		
	}

	@Override
	public List<ProductData> getProductDataByName(String search) {
		List<ProductData> productList = new ArrayList<ProductData>();
		if(search==null || search.length() == 0) 
			return productList;
		else {
			//search = "%" + search + "%"; 
			productList = productDataRepository.findProductDataByName(search);
			return productList;
		}
		
	}

	@Override
	public ProductData createProductData(ProductData productData) {
		ProductData productdata = productDataRepository.save(productData);
		return productdata;
	}

}
