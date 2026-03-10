package com.wipro.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flight {
	@Id
	private long flightid;
	private String flightname;
	private double ticketprice;
	private  int passengerId;
	public Flight(long flightid, String flightname, double ticketprice, int passengerId) {
		super();
		this.flightid = flightid;
		this.flightname = flightname;
		this.ticketprice = ticketprice;
		this.passengerId = passengerId;
	}
	public Flight() {
		super();
	}
	public long getFlightid() {
		return flightid;
	}
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", flightname=" + flightname + ", ticketprice=" + ticketprice
				+ ", passengerId=" + passengerId + "]";
	}
	
	

}
