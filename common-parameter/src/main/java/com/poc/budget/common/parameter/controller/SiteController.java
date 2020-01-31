package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.Site;
import com.poc.budget.common.parameter.service.SiteService;

@RestController
public class SiteController {

	@Autowired
	private SiteService siteservice;

	@GetMapping("/getAllSiteDetails")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<Site> getAllSiteDetails() {
		return siteservice.getAllSiteDetails();
	}

	@GetMapping("/getAllSiteDetails/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<Site> getAllSiteWithParent(@PathVariable long id) {
		return siteservice.getAllSitewithParentId(id);
	}

}
