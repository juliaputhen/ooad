package com.ilp.entity;
import java.util.Set;
import java.util.ArrayList;

public class Customer {
	private String customerCode;
	private String customerName;
	private Set<Account <Account> >accountList;
	
	public Customer(String customerCode, String customerName, ArrayList<Account> accountList) {
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.accountList = accountList;
	}
public String getCustomerCode() {
		return customerCode;
	}
public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
public String getCustomerName() {
		return customerName;
	}
public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Account <Account> >getAccountList() {
		return accountList;
	}

	public void setAccountList(Set<Account <Account> >accountList) {
		this.accountList = accountList;
	}
}
