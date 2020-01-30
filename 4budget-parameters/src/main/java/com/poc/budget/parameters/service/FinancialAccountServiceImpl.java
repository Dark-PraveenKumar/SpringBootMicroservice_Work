package com.poc.budget.parameters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.parameters.entity.FinancialAccount;
import com.poc.budget.parameters.repository.FinancialAccountRepository;

@Service
public class FinancialAccountServiceImpl implements FinancialAccountService{

	@Autowired
	FinancialAccountRepository financialAccountRepository;
	
	@Override
	public String createFinancialAccount(FinancialAccount financialAccount) {
		financialAccountRepository.save(financialAccount);
		return "Account Created successfully";
	}

	@Override
	public FinancialAccount getFinancialAccount(long id) {
		FinancialAccount financialAccount = financialAccountRepository.findByFinancialAccountId(id);
		return financialAccount;
	}

	@Override
	public List<FinancialAccount> getAllFinancialAccounts() {
		List<FinancialAccount> allfinancialAccounts = financialAccountRepository.findAll();
		return allfinancialAccounts;
	}

	@Override
	public List<FinancialAccount> getAllfixedAccounts() {
		List<FinancialAccount> allfixedAccounts = financialAccountRepository.findAllFixedAccounts();
		return allfixedAccounts;
	}

	@Override
	public List<FinancialAccount> getAllinvestmentAccounts() {
	List<FinancialAccount> allinvestmentAccounts = financialAccountRepository.findAllInvestmentAccounts();
		return allinvestmentAccounts;
	}

	@Override
	public List<FinancialAccount> getAllLowValueAccounts() {
		List<FinancialAccount> allLowValueAccounts = financialAccountRepository.findAllLowValueAccounts();
		return allLowValueAccounts;
	}

}
