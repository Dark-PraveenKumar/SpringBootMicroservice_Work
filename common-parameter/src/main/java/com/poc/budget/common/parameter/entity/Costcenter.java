package com.poc.budget.common.parameter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Costcenter {

	@Id
	@GeneratedValue
	private int Id;
	private int AliasId;
	private String defaultCurrency;
	private double ownerId;
	private String SiteName;
	private String visibility;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getAliasId() {
		return AliasId;
	}

	public void setAliasId(int aliasId) {
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

	public String getSiteName() {
		return SiteName;
	}

	public void setSiteName(String sitename) {
		this.SiteName = sitename;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

}
