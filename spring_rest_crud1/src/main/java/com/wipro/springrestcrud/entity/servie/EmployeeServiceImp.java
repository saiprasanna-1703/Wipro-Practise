package com.wipro.springrestcrud.entity.servie;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;
import com.wipro.springrestcrud.repository.EmployeeRepositroy;

public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	EmployeeRepositroy repo;

	@Override
	public Employee addEmp(EmployeeDTO emp) {
		// TODO Auto-generated method stub
	Employee e=new Employee();
		e.setEname(emp.getEname());
		e.setSalary(emp.getSalary());
		return repo.save(e);
	}

	@Override
	public Employee updateemp(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(emp.getEid());
		e.setEname(emp.getEname());
		e.setSalary(emp.getSalary());
		return repo.save(e);
	}
	
	

}
