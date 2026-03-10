package com.wipro.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.springrest.dto.FlightDTO;
import com.wipro.springrest.dto.FlightPassengerVO;
import com.wipro.springrest.dto.Passenger;
import com.wipro.springrest.entity.Flight;
import com.wipro.springrest.repository.FlightRepository;
@Service
public class PassengerServiceImp  implements IPassengerService{
	@Autowired
	FlightRepository repo;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Flight adddetails(FlightDTO dto) {
		Flight f=new Flight();
		f.setFlightid(dto.getFlightid());
		f.setFlightname(dto.getFlightname());
		f.setTicketprice(dto.getTicketprice());
		f.setPassengerId(dto.getPassengerId());
		return repo.save(f);
	}

	@Override
	public Flight updatedetails(FlightDTO dto) {
		Flight f=new Flight();
		f.setFlightid(dto.getFlightid());
		f.setFlightname(dto.getFlightname());
		f.setTicketprice(dto.getTicketprice());
		f.setPassengerId(dto.getPassengerId());
		return repo.save(f);
		
	}

	@Override
	public List<Flight> getall() {
		
		return repo.findAll();
	}

	


	@Override
	public void deletebyid(long flightid) {
		
		repo.deleteById(flightid);
		
	}

	@Override
	public FlightPassengerVO getflightandpassengerbyflightid(long flightid) {
	
		FlightDTO flight=getbyid(flightid);
		int pid=flight.getPassengerId();
		Passenger passenger=restTemplate.getForObject("http://localhost:8282/api/passenger/getbyid/"+pid, Passenger.class);
		FlightPassengerVO f=new FlightPassengerVO();
		f.setFlight(flight);
		f.setPassenger(passenger);
		
		
		return f;
	}

	@Override
	public void updatepassengerbyflight(Passenger passenger) {
		restTemplate.put("http://localhost:8282/api/passenger/update", passenger);
		
	}

	@Override
	public FlightDTO getbyid(long flightid) {
		Flight f=repo.findById(flightid).orElse(null);
		FlightDTO f1=new FlightDTO();
		f1.setFlightid(f.getFlightid());
		f1.setFlightname(f.getFlightname());
		f1.setTicketprice(f1.getTicketprice());
		f1.setPassengerId(f.getPassengerId());
		
		return f1;
	}

	@Override
	public Passenger addpassengerbyflight(Passenger passenger) {
		
		Passenger pas=restTemplate.postForObject("http://localhost:8282/api/passenger/add",passenger, Passenger.class);
		return pas;
		
		
	}

	@Override
	public Passenger[] getallpassengerbyflight() {
		Passenger[] l=restTemplate.getForObject("http://localhost:8282/api/passenger/getall", Passenger[].class);
		return l;
	}

	

}
