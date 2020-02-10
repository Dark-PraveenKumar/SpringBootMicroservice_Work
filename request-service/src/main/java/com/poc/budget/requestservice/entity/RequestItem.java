package com.poc.budget.requestservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="request_item")
public class RequestItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = true, updatable = false)
	private long id;
	
	
	 public enum StateOfRequestItem  {
	        DRAFT ("Draft"),
	        PROPOSED ("Proposed"),
	        DECLINED ("Declined"),
	        ACCEPTED("Accepted"),
	        ORDERED("Ordered"),
	        DELIVERED ("Delivered"),
	        INVOICED ("Invoiced"),
	        DELETED ("Deleted");        
	        
	        private String description;
	        
	        private StateOfRequestItem(String description) {
	            this.description = description;
	        }
	        
	        public String getDescription() {
	            return this.description;
	        }
	    }
	 private String itemId;
	 
	 private String name;
	 
	 private String info;
	 
	 private String commentOne;
		
	 private String commentTwo;
	 
	 @ManyToOne()
	 @JoinColumn(name = "request", nullable = false)
	 @JsonBackReference
	 private Request request;
	 
	 @OneToMany(mappedBy="requestItems",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	 @JsonManagedReference
	 private Set<RequestItemProductDataLink> supplierProductCodes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCommentOne() {
		return commentOne;
	}

	public void setCommentOne(String commentOne) {
		this.commentOne = commentOne;
	}

	public String getCommentTwo() {
		return commentTwo;
	}

	public void setCommentTwo(String commentTwo) {
		this.commentTwo = commentTwo;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Set<RequestItemProductDataLink> getSupplierProductCodes() {
		return supplierProductCodes;
	}

	public void setSupplierProductCodes(Set<RequestItemProductDataLink> supplierProductCodes) {
		this.supplierProductCodes = supplierProductCodes;
	}
	 
	 
}
