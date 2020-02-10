package com.poc.budget.requestservice.model;

public class ProductData {

	private Long id; //changing to reference type so that the default initialization will be null instead of 0, 0 is getting considered as foreign key value for empty form and causing hibernate to think that the object is unsaved rather than uninitialized.
	private String productCode;
	private String uniformProductName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getUniformProductName() {
		return uniformProductName;
	}
	public void setUniformProductName(String uniformProductName) {
		this.uniformProductName = uniformProductName;
	}
	
	
}
