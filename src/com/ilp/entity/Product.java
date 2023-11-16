package com.ilp.entity;
import java.util.Set;
import java.util.ArrayList;

public class Product {
	private String productCode;
	private String productName;
	private Set<Services <Services> >servicesList;
	
	
	public Product(String productCode, String productName, ArrayList<Services> servicesList) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.servicesList = servicesList;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Set<Services <Services> >getServicesList() {
		return servicesList;
	}
	public void setServicesList(Set<Services <Services> >servicesList) {
		this.servicesList = servicesList;
	}
	
}
