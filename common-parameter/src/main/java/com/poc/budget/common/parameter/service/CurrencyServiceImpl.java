package com.poc.budget.common.parameter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.Currency;
import com.poc.budget.common.parameter.repository.CurrencyRepository;

@Service
public class CurrencyServiceImpl implements CurrencyService{

	@Autowired
	CurrencyRepository currencyRepository;
	
	@Override
	public Currency getCurrencyById(long id) {
		// TODO Auto-generated method stub
		return currencyRepository.findCurrencyById(id);
	}

}
