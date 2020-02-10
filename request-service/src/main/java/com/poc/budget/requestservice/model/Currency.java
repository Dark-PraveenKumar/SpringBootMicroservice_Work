package com.poc.budget.requestservice.model;

public class Currency {

	private long id;
	  
	  private String name;
	  
	  private double exRateToEur;

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

	public double getExRateToEur() {
		return exRateToEur;
	}

	public void setExRateToEur(double exRateToEur) {
		this.exRateToEur = exRateToEur;
	}
	  
	  
}
