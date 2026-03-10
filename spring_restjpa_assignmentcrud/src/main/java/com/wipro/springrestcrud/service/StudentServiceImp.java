package com.wipro.springrestcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.wipro.springrestcrud.dto.StudentDTO;
import com.wipro.springrestcrud.entity.Student;
import com.wipro.springrestcrud.repository.StudentRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class StudentServiceImp implements IStudentService{
	@Autowired
	StudentRepository repo;

	
	public Student addEmp(StudentDTO emp) {
		// TODO Auto-generated method stub
		Student e=new Student();
		e.setEname(emp.getEname());
		e.setSalary(emp.getSalary());
		return repo.save(e);
	}

	public Student updateemp(StudentDTO emp) {
		// TODO Auto-generated method stub
		Student e=new Student();
		e.setEid(emp.getEid());
		e.setEname(emp.getEname());
		e.setSalary(emp.getSalary());
		return repo.save(e);
	}

	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	
	public Student getbyEid(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(null);
	}

	public String deletebyEid(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);
		return "record deleted by eid "+eid;
	}

	
	public Student findbyName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByename(ename);
	}

	public List<Student> findbyGreaterThan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBysalaryGreaterThan(salary);
	}

	
	public List<Student> findbysalarylessthan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBysalaryLessThan(salary);
	}


	public List<Student> getsort() {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(Direction.DESC, "salary"));
	}


	public List<Student> getsortbyquery() {
		// TODO Auto-generated method stub
		return repo.getallsort();
	}

	
	public List<Student> getbysalarybtwquery(double a,double b) {
		// TODO Auto-generated method stub
		return repo.findsalarybtw(a, b);
	}


	public double getsumbynamedquery() {
		// TODO Auto-generated method stub
		return repo.getsum();
	}


//	public int getcountbynative() {
		// TODO Auto-generated method stub
	//	return repo.getcountbynative();
	//}

	public Student selectbyeidnamednative(int eid) {
		// TODO Auto-generated method stub
		return repo.selectbyeid(eid);
	}

	public void updatesalary(int eid, double salary) {
		// TODO Auto-generated method stub
	 repo.updatesalary(eid, salary);
	
	}
	
	




}
