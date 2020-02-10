package com.poc.budget.common.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poc.budget.common.parameter.entity.RequestItemType;

public interface RequestItemTypeRepository extends JpaRepository<RequestItemType, Long>{

	@Query("SELECT rit FROM RequestItemType rit where rit.id= :id")
	public RequestItemType findRequestItemTypeById(@Param("id") long id);
}
