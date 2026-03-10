package com.wipro.springhibernate.entity;

import org.springframework.stereotype.Component;

@Component
public class Properties {
private int pid;
private String pname;
private double price;
public Properties(int pid, String pname, double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}
public Properties() {
	super();
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Properties [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

}
