package com.wipro.springrest.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.dto.PassengerDTO;
import com.wipro.springrest.entity.Passenger;
import com.wipro.springrest.exception.ProductNotFoundException;
import com.wipro.springrest.service.IPassengerService;

@RestController
@RequestMapping("api/passenger/")
public class PassengerRestController {
	Logger logger = LoggerFactory.getLogger(PassengerRestController.class);
   @Autowired
   IPassengerService  service;
   @PostMapping("add")
   public Passenger addproduct(@RequestBody PassengerDTO passengerdto) {
	   return service.addpassenger(passengerdto);	   
   }
   @PutMapping("update")
   public Passenger updateproduct(@RequestBody PassengerDTO passengerdto) {
	   
	   return service.updatePassenger(passengerdto);
	   
   }
   @GetMapping("getall")
   public List<Passenger> getall(){
	   logger.debug("I am debug");
		logger.info("I am info");
		logger.warn("I am warning");
	 
	     logger.error("I am error");
	   return service.getall();
   }
   @GetMapping("getbyid/{pid}")
   public Passenger getbyid(@PathVariable int pid)  throws ProductNotFoundException{
	   Passenger passengerDTO=service.getbyid(pid);
	   if (passengerDTO.getPid() == 0) {

			throw new ProductNotFoundException(HttpStatus.BAD_REQUEST, "Product Not Found for Pid : " + pid);
		}
	   return passengerDTO;
   }
   @DeleteMapping("deletebyid/{pid}")
   public String deletepassenger(@PathVariable int pid) {
	   service.deletebyid(pid);
	   return "record deleted";
   }
   @ExceptionHandler({ProductNotFoundException.class}) public
	  ResponseEntity<String> handleProductNotFoundExp(ProductNotFoundException pe)
	  {
	  
	  return new ResponseEntity<String>(pe.getMessage(), HttpStatus.BAD_REQUEST);
	  
	  }
	

}
