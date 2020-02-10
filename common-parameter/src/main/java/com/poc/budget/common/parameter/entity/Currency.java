package com.poc.budget.common.parameter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency")
public class Currency {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
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

	public Currency(String name, double exRateToEur) {
		super();
		this.name = name;
		this.exRateToEur = exRateToEur;
	}

	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  
}
