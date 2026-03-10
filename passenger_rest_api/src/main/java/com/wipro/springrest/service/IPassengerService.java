package com.wipro.springrest.service;

import java.util.List;

import com.wipro.springrest.dto.PassengerDTO;
import com.wipro.springrest.entity.Passenger;

public interface IPassengerService {
	public Passenger addpassenger(PassengerDTO dto);
	public Passenger updatePassenger(PassengerDTO dto);
	public List<Passenger> getall();
	public Passenger getbyid(int pid);
	public void deletebyid(int pid);

}
