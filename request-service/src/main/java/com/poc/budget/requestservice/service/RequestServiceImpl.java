package com.poc.budget.requestservice.service;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.poc.budget.requestservice.entity.Request;
import com.poc.budget.requestservice.entity.RequestItem;
import com.poc.budget.requestservice.entity.RequestItemProductDataLink;
import com.poc.budget.requestservice.model.Business;
import com.poc.budget.requestservice.model.CostCenter;
import com.poc.budget.requestservice.model.Currency;
import com.poc.budget.requestservice.model.FinancialAccount;
import com.poc.budget.requestservice.model.ProductData;
import com.poc.budget.requestservice.model.RequestDetails;
import com.poc.budget.requestservice.model.RequestItemDetails;
import com.poc.budget.requestservice.model.RequestItemProductDatalinkDetails;
import com.poc.budget.requestservice.model.RequestItemType;
import com.poc.budget.requestservice.model.Site;
import com.poc.budget.requestservice.model.Supplier;
import com.poc.budget.requestservice.model.WorkEffort;
import com.poc.budget.requestservice.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService{
	
	@Autowired
	RequestRepository requestRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Request createRequest(Request request) {
		// TODO Auto-generated method stub
		requestRepository.save(request);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		request.setRequestId(new Long(""+request.getId()+(""+year).substring(2)).intValue());
		return requestRepository.save(request);
	}

	@Override
	public Request getRequestById(long id) {
		// TODO Auto-generated method stub
		return requestRepository.findRequestByid(id);
	}
	
	@Override
	public RequestDetails getByRequestId(long id) {
		Request request = requestRepository.findRequestByid(id);
		Set<RequestItemProductDatalinkDetails> productDetails = new HashSet<RequestItemProductDatalinkDetails>();
		Set<RequestItemDetails> itemDetails = new HashSet<RequestItemDetails>();
		RequestDetails requestDetails =new RequestDetails(request.getId(),request.getRequestId(),request.getTitle(),request.getOrderType(),
				request.getReasonForPurchase(),request.getPurchaseType(),request.getSubPurchaseType());
		requestDetails.setDeliveredTo(getSite(request.getDeliveredTo()));
		requestDetails.setPurchaseBy(getCostCenter(request.getPurchaseBy()));
		requestDetails.setPurchasedForOrganization(getBusiness(request.getPurchasedForOrganization()));
		requestDetails.setPurchasedFor(getProgram(request.getPurchasedFor()));
		requestDetails.setSupplier(getSupplier(request.getSupplier()));
		requestDetails.setAccount(getAccount(request.getFinancialAccount()));
		//requestDetails.setItems(request.getItems());
		for(RequestItem items: request.getItems()) {
			RequestItemDetails requestItem = new RequestItemDetails(items.getItemId(),items.getName(),items.getInfo(),items.getCommentOne(),items.getCommentTwo(),items.getId());
			for(RequestItemProductDataLink link : items.getSupplierProductCodes()) {
				RequestItemProductDatalinkDetails products = new RequestItemProductDatalinkDetails();
				products.setProduct_data_id(getProductCode(link.getProduct_data_id()));
				products.setQuantity(link.getQuantity());
				products.setReferencePrice(link.getReferencePrice());
				products.setConvertedReferencePrice(link.getConvertedReferencePrice());
				productDetails.add(products);
			}
			requestItem.setSupplierProductCodes(productDetails);
			requestItem.setUnitPrice(items.getUnitPrice());
			requestItem.setQuantity(items.getQuantity());
			requestItem.setCurrency(getCurrency(items.getCurrency()));
			requestItem.setType(getType(items.getType()));
			itemDetails.add(requestItem);
		}
		requestDetails.setItems(itemDetails);
		return requestDetails;
		
	}
	
	@HystrixCommand(fallbackMethod = "getSite_fallBack")
	public Site getSite(long id) {
		System.out.println("getSite"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/site/getSiteDetailsById/"+id, Site.class);
	}
	
	public Site getSite_fallBack(long id) {
		Site s = new Site();
		s.setId(id);
		s.setName("Info Not Available");
		return s;
	}

	@HystrixCommand(fallbackMethod = "getCostCenter_fallBack")
	public CostCenter getCostCenter(long id) {
		System.out.println("getCostCenter"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/costcenter/getCostCenterById/"+id, CostCenter.class);
	}
	
	public CostCenter getCostCenter_fallBack(int id) {
		CostCenter c = new CostCenter();
		c.setId(id);
		c.setAliasId("Info Not Available");
		return c;
		
	}
	
	@HystrixCommand(fallbackMethod = "getBusiness_fallBack")
	public Business getBusiness(long id) {
		System.out.println("getBusiness"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/business/geBusinessById/"+id, Business.class);
	}
	
	public Business getBusiness_fallBack(long id) {
		Business b = new Business();
		b.setId(id);
		b.setName("Info Not Available");
		return b;
	}
	
	@HystrixCommand(fallbackMethod = "getProgram_fallBack")
	public WorkEffort getProgram(long id) {
		System.out.println("getBusiness"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/workeffort/getWorkEffortById/"+id, WorkEffort.class);
	}
	
	public WorkEffort getProgram_fallBack(long id) {
		WorkEffort wf = new WorkEffort();
		wf.setId(id);
		wf.setName("Info Not Available");
		return wf;
	}
	
	@HystrixCommand(fallbackMethod = "getSupplier_fallBack")
	public Supplier getSupplier(long id) {
		System.out.println("getBusiness"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/supplier/getSupplierById/"+id, Supplier.class);
	}
	
	public Supplier getSupplier_fallBack(long id) {
		Supplier s = new Supplier();
		s.setId(id);
		s.setName("Info Not Available");
		return s;
	}
	
	@HystrixCommand(fallbackMethod = "getProduct_fallBack")
	public ProductData getProductCode(long id) {
		System.out.println("getProductData"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/product/getProductDataById/"+id, ProductData.class);
	}
	
	public ProductData getProduct_fallBack(long id) {
		ProductData p = new ProductData();
		p.setId(id);
		p.setProductCode("Info Not Available");
		return p;
	}
	
	@HystrixCommand(fallbackMethod = "getCurrency_fallBack")
	public Currency getCurrency(long id) {
		System.out.println("getCurrency"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/currency/getCurrencyById/"+id, Currency.class);
	}
	
	public Currency getCurrency_fallBack(long id) {
		Currency c = new Currency();
		c.setId(id);
		c.setName("Info Not Available");
		return c;
	}
	
	@HystrixCommand(fallbackMethod = "getAccount_fallBack")
	public FinancialAccount getAccount(long id) {
		System.out.println("getAccount"+id);
		return restTemplate.getForObject("http://4budget-parameters/4budget/api/4budgetparameters/getAccountById/"+id, FinancialAccount.class);
	}
	
	public FinancialAccount getAccount_fallBack(long id) {
		FinancialAccount f = new FinancialAccount();
		f.setId(id);
		f.setAccountDescription("Info Not Available");
		return f;
	}
	
	@HystrixCommand(fallbackMethod = "getType_fallBack")
	public RequestItemType getType(long id) {
		System.out.println("getAccount"+id);
		return restTemplate.getForObject("http://common-parameter/4budget/api/commonParameter/requestItemtype/getRequestItemTypeById/"+id, RequestItemType.class);
	}
	
	public RequestItemType getType_fallBack(long id) {
		RequestItemType r = new RequestItemType();
		r.setId(id);
		r.setDescription("Info Not Available");
		return r;
	}
}
