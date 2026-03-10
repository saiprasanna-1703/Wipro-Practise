package com.wipro.springboot_h2database.dto;

public class EmployeeDTO {
	private int eid;
	private String ename;
	private double salary;
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + eid + ", name=" + ename + ", salary=" + salary + "]";
	}
	

}
