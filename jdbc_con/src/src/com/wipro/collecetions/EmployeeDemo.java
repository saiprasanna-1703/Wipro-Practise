package com.wipro.collecetions;

import java.util.ArrayList;

public class EmployeeDemo {
	public static void main(String[] args){
		ArrayList<Employee> a=new ArrayList<>();
	    a.add(new Employee(1,"sai","developer",22,50000));
	    a.add(new Employee(2,"ram","lead",25,70000));
	    a.add(new Employee(3,"nick","support",24,30000));
	    a.add(new Employee(1,"rock","support",21,10000));
	    System.out.println(a);
	    for(Employee em:a){
	    	if(em.getDept().equalsIgnoreCase("developer")){
	    		System.out.println(em);
	    	}
	    }
	    for(Employee m:a){
	    	if(m.getAge()>22){
	    		System.out.println(m);
	    	}
	    }
	    int count=0;
	    for(Employee s:a){
	    		
	    		if(s.getDept().equals(s.getDept())){
	    			count++;
	    		}
	    		System.out.println(s.getDept() + count);
	    	
	    }
		
		
	}

}
