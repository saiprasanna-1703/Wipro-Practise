package com.wipro.springrest.service;

import java.util.List;

import com.wipro.springrest.dto.FlightDTO;
import com.wipro.springrest.dto.FlightPassengerVO;
import com.wipro.springrest.dto.Passenger;
import com.wipro.springrest.entity.Flight;

public interface IPassengerService {
	public Flight adddetails(FlightDTO dto);
	public Flight updatedetails(FlightDTO dto);
	public List<Flight> getall();
	public FlightDTO getbyid(long flightid);
    public void deletebyid(long flightid);
    public FlightPassengerVO getflightandpassengerbyflightid(long flightid);
    public void updatepassengerbyflight(Passenger passenger);
    public Passenger addpassengerbyflight(Passenger passenger);
    public Passenger[] getallpassengerbyflight();
    

}
