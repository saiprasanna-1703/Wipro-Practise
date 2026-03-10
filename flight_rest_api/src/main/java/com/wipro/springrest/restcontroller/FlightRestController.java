package com.wipro.springrest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.dto.FlightDTO;
import com.wipro.springrest.dto.FlightPassengerVO;
import com.wipro.springrest.dto.Passenger;
import com.wipro.springrest.entity.Flight;
import com.wipro.springrest.service.IPassengerService;

@RestController
@RequestMapping("api/flight/")
public class FlightRestController {
	@Autowired
	IPassengerService service;
	@PostMapping("add")
	public Flight adddetails(@RequestBody FlightDTO dto) {
		return service.adddetails(dto);
	}
	@PutMapping("update")
	public Flight updatedetails(@RequestBody FlightDTO dto) {
		return service.updatedetails(dto);
	}
	@GetMapping("selectall")
	public List<Flight> selectall(){
		return service.getall();
	}
	@GetMapping("selectbyid/{flightid}")
	public FlightDTO getbyid(@PathVariable long flightid) {
		return service.getbyid(flightid);
	}
	@DeleteMapping("delete/{flightid}")
	public String deletebyid(@PathVariable long flightid) {
		 service.deletebyid(flightid);
		 return "record deleted succesfully";
	}
	@GetMapping("getallflightpassenger/{flightid}")
	public FlightPassengerVO getall(@PathVariable long flightid) {
		return service.getflightandpassengerbyflightid(flightid);
		
	}
	@PutMapping("updatepassenger")
	public String updatepassengerbyflight(@RequestBody Passenger passenger) {
		service.updatepassengerbyflight(passenger);
		return "record updated";
		
	}
	@PostMapping("addpassengerbyflight")
	public Passenger addpassenger(@RequestBody Passenger passenger) { 
		return service.addpassengerbyflight(passenger);
	}
	@GetMapping("getallbyflight")
	public Passenger[] getall() {
		return service.getallpassengerbyflight();
	}

}
