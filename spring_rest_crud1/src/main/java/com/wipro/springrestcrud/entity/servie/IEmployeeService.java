package com.wipro.springrestcrud.entity.servie;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;

public interface IEmployeeService {
	public Employee addEmp(EmployeeDTO emp);
	public Employee updateemp(EmployeeDTO emp);
	
}
