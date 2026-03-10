package com.wipro.springrestcrud.servie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;
import com.wipro.springrestcrud.repository.EmployeeRepositroy;

import jakarta.transaction.Transactional;
@Service
@Transactional
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

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public Employee getbyEid(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deletebyEid(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);
		return "record deleted by eid "+eid;
	}

	@Override
	public Employee findbyName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByename(ename);
	}

	@Override
	public List<Employee> findbyGreaterThan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBysalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> findbysalarylessthan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBysalaryLessThan(salary);
	}

	@Override
	public List<Employee> getsort() {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(Direction.DESC, "salary"));
	}

	@Override
	public List<Employee> getsortbyquery() {
		// TODO Auto-generated method stub
		return repo.getallsort();
	}

	@Override
	public List<Employee> getbysalarybtwquery(double a,double b) {
		// TODO Auto-generated method stub
		return repo.findsalarybtw(a, b);
	}

	@Override
	public double getsumbynamedquery() {
		// TODO Auto-generated method stub
		return repo.getsum();
	}

	@Override
	public int getcountbynative() {
		// TODO Auto-generated method stub
		return repo.getcountbynative();
	}

	@Override
	public Employee selectbyeidnamednative(int eid) {
		// TODO Auto-generated method stub
		return repo.selectbyeid(eid);
	}

	@Override
	public void updatesalary(int eid, double salary) {
		// TODO Auto-generated method stub
	 repo.updatesalary(eid, salary);
	
	}
	
	

}
