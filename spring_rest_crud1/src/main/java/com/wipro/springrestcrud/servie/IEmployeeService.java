package com.wipro.springrestcrud.servie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;

public interface IEmployeeService {
	public Employee addEmp(EmployeeDTO emp);
	public Employee updateemp(EmployeeDTO emp);
	public List<Employee> selectAll();
	public Employee getbyEid(int eid);
	public String deletebyEid(int eid);
	public Employee findbyName(String ename);
	public List<Employee> findbyGreaterThan(double salary);
	public List<Employee> findbysalarylessthan(double salary);
	public List<Employee> getsort();
	public List<Employee> getsortbyquery();
	public List<Employee> getbysalarybtwquery(double a,double b);
    public double getsumbynamedquery();
    public int getcountbynative();
    public Employee selectbyeidnamednative(int eid);
    public void updatesalary(int eid,double salary);
}
