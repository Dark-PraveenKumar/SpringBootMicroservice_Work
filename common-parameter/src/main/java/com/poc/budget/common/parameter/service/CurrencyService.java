package com.poc.budget.common.parameter.service;

import com.poc.budget.common.parameter.entity.Currency;

public interface CurrencyService {

	public Currency getCurrencyById(long id);
	
	public Double convertCurrency(long currencyfrom,long currencyTo,double price);
}
