package com.wipro.springrest.dto;

public class FlightPassengerVO {
	private FlightDTO flight;
	private  Passenger passenger;
	public FlightPassengerVO() {
		super();
	}
	public FlightDTO getFlight() {
		return flight;
	}
	public void setFlight(FlightDTO flight) {
		this.flight = flight;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	@Override
	public String toString() {
		return "FlightPassengerVO [flight=" + flight + ", passenger=" + passenger + "]";
	}
	
	

}
