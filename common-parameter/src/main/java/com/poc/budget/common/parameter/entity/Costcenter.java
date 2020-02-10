package com.poc.budget.common.parameter.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Costcenter {

	@Id
	@GeneratedValue
	private long Id;
	private String AliasId;
	private String defaultCurrency;
	private Long ownerId;
	private String SiteName;
	private String visibility;
	@ManyToMany
	@JoinTable(
			  name = "Site_Costcenter_link", 
			  joinColumns = @JoinColumn(name = "costcenter_id"), 
			  inverseJoinColumns = @JoinColumn(name = "site_id"))
	private Set<Site> sites;

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

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
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
