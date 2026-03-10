package com.wipro.hibernate1_demo;

import java.util.List;

import com.wipro.hibernate1_demo.entity.Employee1;

public class NamedQuery {
	public static void main(String[] args) {


		DaoImp dao = new DaoImp();
		
			
		Employee1 emp =	dao.getEmpByEid();
		
		System.out.println(emp);
		
		
	List<Employee1> list =  dao.getAll();
		
		
				for (Employee1 e1 : list) {
					
					
						System.out.println(e1);
				}
	
	
	

}

}
