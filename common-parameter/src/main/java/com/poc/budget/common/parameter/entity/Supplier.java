package com.poc.budget.common.parameter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	
	private String name;
	
	private boolean bookingRemoved;
	
	private boolean budgetRemoved;
	
	private String type;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBookingRemoved() {
		return bookingRemoved;
	}
	public void setBookingRemoved(boolean bookingRemoved) {
		this.bookingRemoved = bookingRemoved;
	}
	public boolean isBudgetRemoved() {
		return budgetRemoved;
	}
	public void setBudgetRemoved(boolean budgetRemoved) {
		this.budgetRemoved = budgetRemoved;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Supplier(String name, boolean bookingRemoved, boolean budgetRemoved, String type) {
		super();
		this.name = name;
		this.bookingRemoved = bookingRemoved;
		this.budgetRemoved = budgetRemoved;
		this.type = type;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
