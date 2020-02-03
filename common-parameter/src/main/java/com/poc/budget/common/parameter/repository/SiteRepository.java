package com.poc.budget.common.parameter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.budget.common.parameter.entity.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Integer>{

	@Query("SELECT s FROM Site s WHERE s.parent= :id")
	public List<Site> getAllSitewithParentId(@Param("id") long id);
	
	@Query("SELECT s FROM Site s WHERE s.parent is null")
	public List<Site> getAllParentSites();
	
}
