package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.Supplier;

public interface SupplierService {

	public List<Supplier> getSuggestiveSuppliers(String search);
	
	public Supplier createSupplier(Supplier supplier);
	
	public Supplier getSupplierById(long id);
}
