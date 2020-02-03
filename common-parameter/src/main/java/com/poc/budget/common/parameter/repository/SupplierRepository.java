package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poc.budget.common.parameter.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

	@Query(value = "SELECT * FROM supplier WHERE name LIKE %:search% and type = 1 and budget_removed = 0", nativeQuery = true)
	public List<Supplier> findSuggestiveSuppliers(@Param("search") String name);
}
