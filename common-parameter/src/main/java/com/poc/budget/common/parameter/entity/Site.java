package com.poc.budget.common.parameter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Site {

	@Id
	private long id;
	private String name;
	private String fullname;
	private String type;
	private String parent;
	private String Children;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getChildren() {
		return Children;
	}

	public void setChildren(String children) {
		Children = children;
	}

}
