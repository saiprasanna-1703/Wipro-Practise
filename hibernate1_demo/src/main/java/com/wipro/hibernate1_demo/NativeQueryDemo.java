package com.wipro.hibernate1_demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.wipro.hibernate1_demo.entity.Employee1;

public class NativeQueryDemo {
	public static void main(String[] args) {


		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		// SQL Query
		String sqlQuery = "select * from emp_table";
		
			NativeQuery<Employee1>  query =		session.createNativeQuery(sqlQuery, Employee1.class);
		
			
				List<Employee1> list =	query.getResultList();
				
				
				//list.forEach(System.out::println);
				
				list.forEach((emp)->{System.out.println(emp);});
				
				
				session.close();
			
			
	}



}
