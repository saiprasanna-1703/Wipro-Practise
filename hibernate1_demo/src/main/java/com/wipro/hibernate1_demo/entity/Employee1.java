package com.wipro.hibernate1_demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="emp_table")

public class Employee1 {
	@Id
	private int eid;
	private String name;
	@Column(name="amount")
	private double price;
	public Employee1(int eid, String name, double price) {
		super();
		this.eid = eid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", price=" + price + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Employee1() {
		super();
	}
	
	

}
