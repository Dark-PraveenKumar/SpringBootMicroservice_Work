package com.poc.budget.common.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.budget.common.parameter.entity.RequestItemType;

public interface RequestItemTypeRepository extends JpaRepository<RequestItemType, Long>{

}
