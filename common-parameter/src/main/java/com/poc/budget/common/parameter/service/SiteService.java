package com.poc.budget.common.parameter.service;

import java.util.List;

import com.poc.budget.common.parameter.entity.Site;

public interface SiteService {

	public List<Site> getAllSiteDetails();
	
	public List<Site> getAllSitewithParentId(long id);
	
	public Site findSiteById(long id);
	
}
