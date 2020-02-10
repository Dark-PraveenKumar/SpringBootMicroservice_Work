package com.poc.budget.requestservice.model;


public class Business {

	private long Id;
	private String name;
	private Business ParentUnit;
	private String fullNameCached;
	private String color;
	private String visibility;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Business getParentUnit() {
		return ParentUnit;
	}
	public void setParentUnit(Business parentUnit) {
		ParentUnit = parentUnit;
	}
	public String getFullNameCached() {
		return fullNameCached;
	}
	public void setFullNameCached(String fullNameCached) {
		this.fullNameCached = fullNameCached;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	
	
}
