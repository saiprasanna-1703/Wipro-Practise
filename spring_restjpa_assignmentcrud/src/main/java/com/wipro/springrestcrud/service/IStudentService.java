package com.wipro.springrestcrud.service;

import java.util.List;

import com.wipro.springrestcrud.dto.StudentDTO;
import com.wipro.springrestcrud.entity.Student;



public interface IStudentService {
	public Student addEmp(StudentDTO emp);
	public Student updateemp(StudentDTO emp);
	public List<Student> selectAll();
	public Student getbyEid(int eid);
	public String deletebyEid(int eid);
	public Student findbyName(String ename);
	public List<Student> findbyGreaterThan(double salary);
	public List<Student> findbysalarylessthan(double salary);
	public List<Student> getsort();
	public List<Student> getsortbyquery();
	public List<Student> getbysalarybtwquery(double a,double b);
    public double getsumbynamedquery();
   // public int getcountbynative();
    public Student selectbyeidnamednative(int eid);
    public void updatesalary(int eid,double salary);
}

