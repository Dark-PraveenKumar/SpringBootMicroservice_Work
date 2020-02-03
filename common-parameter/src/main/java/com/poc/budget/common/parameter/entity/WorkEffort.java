package com.poc.budget.common.parameter.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "work_effort")
public class WorkEffort {

	public static final String DESCRIPTION_PROGRAM = "Program";
	public static final String DESCRIPTION_WBS = "WBS";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	private String effortId;
	private String name;
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
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

	public WorkEffort(String effortId, String name, String description, WorkEffort parentEffort) {
		super();
		this.effortId = effortId;
		this.name = name;
		this.description = description;
		this.parentEffort = parentEffort;
	}

	public WorkEffort() {
		super();
		// TODO Auto-generated constructor stub
	}
}
