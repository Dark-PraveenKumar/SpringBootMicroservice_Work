package com.poc.budget.requestservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="request_item")
public class RequestItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
   
	private String itemId;
	 
	 private String name;
	 
	 private String info;
	 
	 private String commentOne;
		
	 private String commentTwo;
	 
	 private Double unitPrice;
	 
	 private long quantity;
	 
	 private long currency;
	 
	 private long type;
	 
	 @ManyToOne()
	 @JoinColumn(name = "request", nullable = false)
	 @JsonBackReference
	 private Request request;
	 
	 @OneToMany(mappedBy="requestItems",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	 @JsonManagedReference
	 private Set<RequestItemProductDataLink> supplierProductCodes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Set<RequestItemProductDataLink> getSupplierProductCodes() {
		return supplierProductCodes;
	}

	public void setSupplierProductCodes(Set<RequestItemProductDataLink> supplierProductCodes) {
		this.supplierProductCodes = supplierProductCodes;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getCurrency() {
		return currency;
	}

	public void setCurrency(long currency) {
		this.currency = currency;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}
	 
	 
}
