package com.wipro.collecetions;

import java.util.HashSet;

public class SetDemo2 {
	public static void main(String[] args){
		HashSet<EmployeSet> employe=new HashSet<>();
		employe.add(new EmployeSet(1,"sai"));
		employe.add(new EmployeSet(2,"ram"));
		employe.add(new EmployeSet(3,"sita"));
		employe.add(new EmployeSet(4,"prasanna"));
	
	for(EmployeSet i:employe){
		System.out.println(i);
		
	}
	}
}
