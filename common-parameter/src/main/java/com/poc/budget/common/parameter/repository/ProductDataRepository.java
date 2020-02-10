package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Costcenter;
import com.poc.budget.common.parameter.entity.ProductData;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductData, Long>{

	//@Query("SELECT pd FROM ProductData pd WHERE pd.productCode LIKE %:search% and pd.addedByUser = 0 and pd.type ='NULL'")
	//public List<ProductData> findProductDataByCode(@Param("search") String productCode);
	
	//@Query("SELECT pd FROM ProductData pd WHERE pd.uniformProductName LIKE %:search% and pd.addedByUser = 0 and pd.type ='NULL'")
	//public List<ProductData> findProductDataByName(@Param("search") String uniformProductName);
	
	@Query(value = "SELECT * FROM product_data WHERE product_code LIKE %:search% and added_by_user = 0 and type ='NULL' limit 5", nativeQuery = true)
	public List<ProductData> findProductDataByCode(@Param("search") String productCode);
	
	@Query(value = "SELECT * FROM product_data WHERE uniform_product_name LIKE %:search% and added_by_user = 0 and type ='NULL' limit 5", nativeQuery = true)
	public List<ProductData> findProductDataByName(@Param("search") String productCode);
	
	@Query("SELECT pd FROM ProductData pd where pd.id= :id")
	public ProductData findProductDataById(@Param("id") long id);
	
}
