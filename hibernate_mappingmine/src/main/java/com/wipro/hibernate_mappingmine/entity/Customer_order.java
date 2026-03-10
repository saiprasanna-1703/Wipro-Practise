package com.wipro.hibernate_mappingmine.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
public class Customer_order {
	@Id
	private int ino;
	
	private String iname;
	private double price;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="mid")
	private Restaurant_Menu restaurant_menu; 
	public Customer_order(int ino, String iname, double price, Restaurant_Menu restaurant_menu) {
		super();
		this.ino = ino;
		this.iname = iname;
		this.price = price;
		this.restaurant_menu = restaurant_menu;
	}
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Restaurant_Menu getRestaurant_menu() {
		return restaurant_menu;
	}
	public void setRestaurant_menu(Restaurant_Menu restaurant_menu) {
		this.restaurant_menu = restaurant_menu;
	}
	public Customer_order() {
		super();
	}

}
