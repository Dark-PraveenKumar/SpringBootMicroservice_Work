package com.poc.budget.requestservice.model;

public class CostCenter {

	private long Id;
	private String AliasId;
	private String defaultCurrency;
	private double ownerId;
	private String visibility;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getAliasId() {
		return AliasId;
	}
	public void setAliasId(String aliasId) {
		AliasId = aliasId;
	}
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public double getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(double ownerId) {
		this.ownerId = ownerId;
	}


	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	
}
