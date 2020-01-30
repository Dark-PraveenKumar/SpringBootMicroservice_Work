package com.poc.budget.parameters.service;

import java.util.List;

import com.poc.budget.parameters.entity.FinancialAccount;

public interface FinancialAccountService {

	public String createFinancialAccount(FinancialAccount financialAccount);
	public FinancialAccount getFinancialAccount(long id);
	public List<FinancialAccount> getAllFinancialAccounts();
	public List<FinancialAccount> getAllfixedAccounts();
	public List<FinancialAccount> getAllinvestmentAccounts();
	public List<FinancialAccount> getAllLowValueAccounts();
}
