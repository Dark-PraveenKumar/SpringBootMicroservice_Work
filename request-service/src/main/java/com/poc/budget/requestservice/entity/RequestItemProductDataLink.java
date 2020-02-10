package com.poc.budget.requestservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="request_item_product_data_link")
public class RequestItemProductDataLink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	
	@ManyToOne()
	@JoinColumn(name = "item_id", nullable = false)
	@JsonBackReference
	private RequestItem requestItems;
	private long product_data_id;
	private Double referencePrice;
	private Integer quantity;
	private Double convertedReferencePrice;
	public RequestItem getRequestItems() {
		return requestItems;
	}
	public void setRequestItems(RequestItem requestItems) {
		this.requestItems = requestItems;
	}
	public long getProduct_data_id() {
		return product_data_id;
	}
	public void setProduct_data_id(long product_data_id) {
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	} 
	
	
}
