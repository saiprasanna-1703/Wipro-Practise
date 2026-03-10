package com.wipro.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springrest.entity.Flight;

public interface FlightRepository  extends JpaRepository<Flight, Long>{
	

}
