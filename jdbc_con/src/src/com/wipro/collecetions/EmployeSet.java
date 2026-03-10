package com.wipro.collecetions;

public class EmployeSet {
	int id;
	String name;
	public EmployeSet(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "EmployeSet [id=" + id + ", name=" + name + "]";
	}
	

}
