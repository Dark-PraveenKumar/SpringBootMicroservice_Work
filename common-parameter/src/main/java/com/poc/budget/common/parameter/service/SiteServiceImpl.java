package com.poc.budget.common.parameter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.budget.common.parameter.entity.Site;
import com.poc.budget.common.parameter.repository.SiteRepository;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
	private SiteRepository siterepository;
	
	@Override
	public List<Site> getAllSiteDetails() {
		return siterepository.getAllParentSites();
	}

	@Override
	public List<Site> getAllSitewithParentId(long id) {
		return siterepository.getAllSitewithParentId(id);
	}

}
