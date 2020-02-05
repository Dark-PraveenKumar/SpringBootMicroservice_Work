package com.poc.budget.common.parameter.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.poc.budget.common.parameter.model.Visiblity;

@Entity
public class Business {
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private long ParentUnit;
	private String fullNameCached;
	private String color;
	private Visiblity visibility;
	
	@ManyToMany(mappedBy = "businesses")
	private Set<WorkEffort> workEfforts;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getParentUnit() {
		return ParentUnit;
	}

	public void setParentUnit(long parentUnit) {
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


}
