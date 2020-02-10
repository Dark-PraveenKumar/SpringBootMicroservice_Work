package com.poc.budget.requestservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	private int requestId;
	private String title;
	private String orderType;
	private String reasonForPurchase;
	private String purchaseType;
	private String subPurchaseType;
	private long deliveredTo;
	private long purchaseBy;
	private long purchasedForOrganization;
	private long purchasedFor;
	private long supplier;
	private long financialAccount;
	
	@OneToMany(mappedBy="request",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<RequestItem> items;
	
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
	public long getDeliveredTo() {
		return deliveredTo;
	}
	public void setDeliveredTo(long deliveredTo) {
		this.deliveredTo = deliveredTo;
	}
	public long getPurchaseBy() {
		return purchaseBy;
	}
	public void setPurchaseBy(long purchaseBy) {
		this.purchaseBy = purchaseBy;
	}
	public long getPurchasedForOrganization() {
		return purchasedForOrganization;
	}
	public void setPurchasedForOrganization(long purchasedForOrganization) {
		this.purchasedForOrganization = purchasedForOrganization;
	}
	public long getPurchasedFor() {
		return purchasedFor;
	}
	public void setPurchasedFor(long purchasedFor) {
		this.purchasedFor = purchasedFor;
	}
	public long getSupplier() {
		return supplier;
	}
	public void setSupplier(long supplier) {
		this.supplier = supplier;
	}
	public Request(int requestId, String title, String orderType, String reasonForPurchase, String purchaseType,
			String subPurchaseType, long deliveredTo, long purchaseBy, long purchasedForOrganization, long purchasedFor,
			long supplier) {
		super();
		this.requestId = requestId;
		this.title = title;
		this.orderType = orderType;
		this.reasonForPurchase = reasonForPurchase;
		this.purchaseType = purchaseType;
		this.subPurchaseType = subPurchaseType;
		this.deliveredTo = deliveredTo;
		this.purchaseBy = purchaseBy;
		this.purchasedForOrganization = purchasedForOrganization;
		this.purchasedFor = purchasedFor;
		this.supplier = supplier;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<RequestItem> getItems() {
		return items;
	}
	public void setItems(Set<RequestItem> items) {
		this.items = items;
	}
	public long getFinancialAccount() {
		return financialAccount;
	}
	public void setFinancialAccount(long financialAccount) {
		this.financialAccount = financialAccount;
	}
	
	
}
