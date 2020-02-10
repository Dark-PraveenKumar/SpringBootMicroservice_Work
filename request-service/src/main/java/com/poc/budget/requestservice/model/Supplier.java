package com.poc.budget.requestservice.model;

public class Supplier {

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
	
	
}
