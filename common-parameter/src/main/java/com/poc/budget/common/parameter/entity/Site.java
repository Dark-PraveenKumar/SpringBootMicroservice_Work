package com.poc.budget.common.parameter.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Site {

	@Id
	private long id;
	private String name;
	private String fullname;
//	private String type;
	@ManyToOne(cascade = CascadeType.ALL)
	private Site parent;
	@Transient
	private String Children;
	
	@ManyToMany(mappedBy = "sites")
	private Set<Costcenter> costcenter;
	

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

	/*
	 * public String getType() { return type; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 */
	

	public String getChildren() {
		return Children;
	}

	public void setChildren(String children) {
		Children = children;
	}

}
