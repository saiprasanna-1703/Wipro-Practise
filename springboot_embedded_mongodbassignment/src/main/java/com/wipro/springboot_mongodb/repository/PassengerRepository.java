package com.wipro.springboot_mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springboot_mongodb.entity.Passenger;
@Repository
public interface PassengerRepository  extends  MongoRepository<Passenger,String>{
	void deleteById(String id);
	Optional<Passenger> findById(String id);
	boolean existsById(String id);


}
