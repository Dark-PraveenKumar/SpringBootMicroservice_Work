package com.poc.budget.parameters.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="financial_account")
public class FinancialAccount implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	@Column(name = "description")
	private String accountDescription;
	@Column(name = "type")
	private String accountType;
	@Column(name = "code")
	private String accountCode="";
	@Column(name = "typeFlag")
	private Integer typeFlag; // Capex : 0, Opex : 1, Low value asset : 2
	
	
	public FinancialAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FinancialAccount(String accountDescription, String accountType, String accountCode, Integer typeFlag) {
		super();
		this.accountDescription = accountDescription;
		this.accountType = accountType;
		this.accountCode = accountCode;
		this.typeFlag = typeFlag;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountDescription() {
		return accountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public Integer getTypeFlag() {
		return typeFlag;
	}
	public void setTypeFlag(Integer typeFlag) {
		this.typeFlag = typeFlag;
	}
	
	
	
}
