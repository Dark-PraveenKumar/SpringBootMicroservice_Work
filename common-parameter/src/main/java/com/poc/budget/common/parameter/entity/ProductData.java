package com.poc.budget.common.parameter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_data")
public class ProductData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private Long id; //changing to reference type so that the default initialization will be null instead of 0, 0 is getting considered as foreign key value for empty form and causing hibernate to think that the object is unsaved rather than uninitialized.
	private String productCode;
	private String uniformProductName;
	private Double referencePrice;
	private Boolean updateFlag;
	private Boolean addedByUser;
	private String type;
	
	
	public ProductData(String productCode, String uniformProductName, Double referencePrice, Boolean updateFlag,
			Boolean addedByUser, String type) {
		super();
		this.productCode = productCode;
		this.uniformProductName = uniformProductName;
		this.referencePrice = referencePrice;
		this.updateFlag = updateFlag;
		this.addedByUser = addedByUser;
		this.type = type;
	}
	public ProductData() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Double getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(Double referencePrice) {
		this.referencePrice = referencePrice;
	}
	public Boolean getUpdateFlag() {
		return updateFlag;
	}
	public void setUpdateFlag(Boolean updateFlag) {
		this.updateFlag = updateFlag;
	}
	public Boolean getAddedByUser() {
		return addedByUser;
	}
	public void setAddedByUser(Boolean addedByUser) {
		this.addedByUser = addedByUser;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
