package com.poc.budget.parameters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.parameters.entity.FinancialAccount;
import com.poc.budget.parameters.service.FinancialAccountService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api")
public class FinancialAccountController {

	@Autowired
	FinancialAccountService financialAccountService;
	
	@RequestMapping("/greet")
    public String greet(){
        return "Welcome to 4budget-parameters";
    }
	
	@Operation(summary = "Create Account")
	@PostMapping("/account")
	public String createAccount(@RequestBody FinancialAccount financialAccount) {
		String result = financialAccountService.createFinancialAccount(financialAccount);
		return result;
	}
	
	@Operation(summary = "Get Account Details for given Id")
	@GetMapping("/getAccountById/{accountId}")
	public ResponseEntity<Object> getAccountById(@PathVariable Long accountId) {
		FinancialAccount financialAccount=  financialAccountService.getFinancialAccount(accountId);
		if(financialAccount!=null)
			return ResponseEntity.ok().body(financialAccount);
		else
			return ResponseEntity.ok().body("Account not found");
	}
	
	@Operation(summary = "Get list of all Accounts")
	@GetMapping("/getAllAccounts")
	public List<FinancialAccount> getAllAccounts() {
		return financialAccountService.getAllFinancialAccounts();
	}
	
	@Operation(summary = "Get list of all investment accounts")
	@GetMapping("/getAllInvestmentAccounts")
	public List<FinancialAccount> getAllInvestmentAccounts() {
		return financialAccountService.getAllinvestmentAccounts();
	}
	
	@Operation(summary = "Get list of all fixed cost accounts")
	@GetMapping("/getAllFixedCostAccounts")
	public List<FinancialAccount> getAllFixedCostAccounts() {
		return financialAccountService.getAllfixedAccounts();
	}
	
	@Operation(summary = "Get list of all low value accounts")
	@GetMapping("/getAllLowValueAccounts")
	public List<FinancialAccount> getAllLowValueAccounts() {
		return financialAccountService.getAllLowValueAccounts();
	}
	
}
