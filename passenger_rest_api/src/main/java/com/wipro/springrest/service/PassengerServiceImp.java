package com.wipro.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springrest.dto.PassengerDTO;
import com.wipro.springrest.entity.Passenger;
import com.wipro.springrest.repository.PasengerRepository;
@Service
public class PassengerServiceImp implements IPassengerService {
	@Autowired
	PasengerRepository repo;

	@Override
	public Passenger addpassenger(PassengerDTO dto) {
		Passenger p=new Passenger();
		//p.setPid(dto.getPid());
		p.setPname(dto.getPname());
		p.setEmail(dto.getEmail());
		return  repo.save(p);
	}

	@Override
	public Passenger updatePassenger(PassengerDTO dto) {
		Passenger p=new Passenger();
		p.setPid(dto.getPid());
		p.setPname(dto.getPname());
		p.setEmail(dto.getEmail());
		
		return repo.save(p);
	}

	@Override
	public List<Passenger> getall() {
		
		return repo.findAll();
	}

	@Override
	public Passenger getbyid(int pid) {
		Passenger e =repo.findById(pid).orElse(null);
		return e;
	}

	@Override
	public void deletebyid(int pid) {
		repo.deleteById(pid);
		
	}

}
