package com.poc.budget.requestservice.model;

import java.util.Set;

import com.poc.budget.requestservice.entity.RequestItemProductDataLink;

public class RequestItemDetails {

	private String itemId;
	 
	 private String name;
	 
	 private String info;
	 
	 private String commentOne;
		
	 private String commentTwo;
	 private long id;
	 private Set<RequestItemProductDatalinkDetails> supplierProductCodes;
	 
	 private Currency currency;
	 
	 private Double unitPrice;
	 
	 private long quantity;
	 
	 private RequestItemType type;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCommentOne() {
		return commentOne;
	}

	public void setCommentOne(String commentOne) {
		this.commentOne = commentOne;
	}

	public String getCommentTwo() {
		return commentTwo;
	}

	public void setCommentTwo(String commentTwo) {
		this.commentTwo = commentTwo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<RequestItemProductDatalinkDetails> getSupplierProductCodes() {
		return supplierProductCodes;
	}

	public void setSupplierProductCodes(Set<RequestItemProductDatalinkDetails> supplierProductCodes) {
		this.supplierProductCodes = supplierProductCodes;
	}

	public RequestItemDetails(String itemId, String name, String info, String commentOne, String commentTwo, long id) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.info = info;
		this.commentOne = commentOne;
		this.commentTwo = commentTwo;
		this.id = id;
	}

	public RequestItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public RequestItemType getType() {
		return type;
	}

	public void setType(RequestItemType type) {
		this.type = type;
	}
	 
	 
}
