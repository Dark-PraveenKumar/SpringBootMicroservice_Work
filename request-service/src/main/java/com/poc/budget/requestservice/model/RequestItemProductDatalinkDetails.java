package com.poc.budget.requestservice.model;

public class RequestItemProductDatalinkDetails {

	private ProductData product_data_id;
	private Double referencePrice;
	private Integer quantity;
	private Double convertedReferencePrice;
	public ProductData getProduct_data_id() {
		return product_data_id;
	}
	public void setProduct_data_id(ProductData product_data_id) {
		this.product_data_id = product_data_id;
	}
	public Double getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(Double referencePrice) {
		this.referencePrice = referencePrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getConvertedReferencePrice() {
		return convertedReferencePrice;
	}
	public void setConvertedReferencePrice(Double convertedReferencePrice) {
		this.convertedReferencePrice = convertedReferencePrice;
	}
	
	
}
