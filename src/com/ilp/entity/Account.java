package com.ilp.entity;

public class Account {
	private String accountNo;
	private double balance;
	private Product product;
	
	public Account(String accountNo, double balance, Product product) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.product = product;
	}
private String getAccountNo() {
		return accountNo;
	}
private void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
private double getBalance() {
		return balance;
	}
private void setBalance(double balance) {
		this.balance = balance;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
