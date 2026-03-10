package com.wipro.product;

public class Product {
	private int accountnum;
	private String name;
	private int money;
	public static void main(String[] args) {
		
	}
	public Product(int accountnum, String name, int money) {
		super();
		this.accountnum = accountnum;
		this.name = name;
		this.money = money;
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Product [accountnum=" + accountnum + ", name=" + name + ", money=" + money + "]";
	}
	

}
