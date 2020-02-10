package com.poc.budget.requestservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.requestservice.entity.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer>{

	@Query("SELECT r FROM Request r WHERE r.id= :id")
	public Request findRequestByid(@Param("id") long id);
	
}
