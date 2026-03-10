package com.wipro.springrestcrud.dto;

public class StudentDTO {
	private int eid;
	private String ename;
	private double salary;
	public StudentDTO() {
		super();
	}
	public StudentDTO(int eid, String ename, double salary) {
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "StudentDTO [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
