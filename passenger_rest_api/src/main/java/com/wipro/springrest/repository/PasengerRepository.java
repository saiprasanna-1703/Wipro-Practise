package com.wipro.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springrest.entity.Passenger;

public interface PasengerRepository extends JpaRepository<Passenger, Integer> {

}
