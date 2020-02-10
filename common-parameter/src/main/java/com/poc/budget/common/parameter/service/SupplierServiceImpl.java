package com.poc.budget.common.parameter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.Supplier;
import com.poc.budget.common.parameter.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	SupplierRepository supplierRepository;
	
	@Override
	public List<Supplier> getSuggestiveSuppliers(String search) {
		List<Supplier> supplier = new ArrayList<Supplier>();
		if(search==null || search.length() == 0)
			return supplier;
		else {
			//search = "%" + search + "%"; 
			supplier = supplierRepository.findSuggestiveSuppliers(search);
			return supplier;
		}
	}

	@Override
	public Supplier createSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierRepository.save(supplier);
	}

	@Override
	public Supplier getSupplierById(long id) {
		// TODO Auto-generated method stub
		return supplierRepository.findSupplierById(id);
	}

}
