package com.poc.budget.common.parameter.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.budget.common.parameter.entity.Site;
import com.poc.budget.common.parameter.service.SiteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "4budget-parameter", description = ": API")
@RequestMapping("/4budget/api/commonParameter/site")
public class SiteController {

	@Autowired
	private SiteService siteservice;

	@Operation(summary = "getALLSiteDetails")
	@GetMapping("/getAllSiteDetails")
	@Produces("application/json")
	@Consumes("application/json")
	public @ResponseBody List<Site> getAllSiteDetails() {
		return siteservice.getAllSiteDetails();
	}

	@GetMapping("/getAllSiteDetails/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	@Operation(summary = "Get sub sites for the parent site")
	public @ResponseBody List<Site> getAllSiteWithParent(@PathVariable long id) {
		return siteservice.getAllSitewithParentId(id);
	}

	@GetMapping("/getSiteDetailsById/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	@Operation(summary = "Get sites by id")
	public @ResponseBody Site getSiteById(@PathVariable long id) {
		return siteservice.findSiteById(id);
	}
}
