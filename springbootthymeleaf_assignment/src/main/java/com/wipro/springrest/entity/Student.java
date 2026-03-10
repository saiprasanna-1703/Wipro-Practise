package com.wipro.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_practise")
@NamedNativeQuery(name="Student.selectbyeid",query="select * from student_practise where eid=?1",resultClass=Student.class)
@NamedQueries(@NamedQuery(name="Student.getsum",query="select sum(e.salary) from Student e"))
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	public Student() {
		super();
	}
	public Student(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
