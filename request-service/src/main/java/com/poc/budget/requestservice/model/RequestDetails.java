package com.poc.budget.requestservice.model;

import java.util.Set;

import com.poc.budget.requestservice.entity.RequestItem;

public class RequestDetails {

	private long id;
	private int requestId;
	private String title;
	private String orderType;
	private String reasonForPurchase;
	private String purchaseType;
	private String subPurchaseType;
	private Site deliveredTo;
	private CostCenter purchaseBy;
	private Business purchasedForOrganization;
	private WorkEffort purchasedFor;
	private Supplier supplier;
	private Set<RequestItemDetails> items;
	private FinancialAccount account;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
		}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getReasonForPurchase() {
		return reasonForPurchase;
	}
	public void setReasonForPurchase(String reasonForPurchase) {
		this.reasonForPurchase = reasonForPurchase;
	}
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getSubPurchaseType() {
		return subPurchaseType;
	}
	public void setSubPurchaseType(String subPurchaseType) {
		this.subPurchaseType = subPurchaseType;
	}
	public Site getDeliveredTo() {
		return deliveredTo;
	}
	public void setDeliveredTo(Site deliveredTo) {
		this.deliveredTo = deliveredTo;
	}
	public CostCenter getPurchaseBy() {
		return purchaseBy;
	}
	public void setPurchaseBy(CostCenter purchaseBy) {
		this.purchaseBy = purchaseBy;
	}
	public Business getPurchasedForOrganization() {
		return purchasedForOrganization;
	}
	public void setPurchasedForOrganization(Business purchasedForOrganization) {
		this.purchasedForOrganization = purchasedForOrganization;
	}
	public WorkEffort getPurchasedFor() {
		return purchasedFor;
	}
	public void setPurchasedFor(WorkEffort purchasedFor) {
		this.purchasedFor = purchasedFor;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public RequestDetails(long id, int requestId, String title, String orderType, String reasonForPurchase,
			String purchaseType, String subPurchaseType) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.title = title;
		this.orderType = orderType;
		this.reasonForPurchase = reasonForPurchase;
		this.purchaseType = purchaseType;
		this.subPurchaseType = subPurchaseType;
	}
	public Set<RequestItemDetails> getItems() {
		return items;
	}
	public void setItems(Set<RequestItemDetails> items) {
		this.items = items;
	}
	public FinancialAccount getAccount() {
		return account;
	}
	public void setAccount(FinancialAccount account) {
		this.account = account;
	}
	
	
}
