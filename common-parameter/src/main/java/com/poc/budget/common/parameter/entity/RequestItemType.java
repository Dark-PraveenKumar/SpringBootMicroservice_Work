package com.poc.budget.common.parameter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="request_item_type")
public class RequestItemType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	private String description;
	private Integer menuorder;
	private boolean editable;
	private boolean visible = true; //item types must be visible by default
	 
	
	public long getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getMenuorder() {
		return menuorder;
	}
	public void setMenuorder(Integer menuorder) {
		this.menuorder = menuorder;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public RequestItemType(String description, Integer menuorder, boolean editable, boolean visible) {
		super();
		this.description = description;
		this.menuorder = menuorder;
		this.editable = editable;
		this.visible = visible;
	}

	public RequestItemType() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
