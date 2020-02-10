package com.poc.budget.requestservice.model;

public class WorkEffort {

	private long id;
	private String effortId;
	private String name;
	private String description;
	private WorkEffort parentEffort;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEffortId() {
		return effortId;
	}
	public void setEffortId(String effortId) {
		this.effortId = effortId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public WorkEffort getParentEffort() {
		return parentEffort;
	}
	public void setParentEffort(WorkEffort parentEffort) {
		this.parentEffort = parentEffort;
	}
	
	

}
