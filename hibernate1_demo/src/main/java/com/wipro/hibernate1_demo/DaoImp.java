package com.wipro.hibernate1_demo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.hibernate1_demo.entity.Employee1;

public class DaoImp {
	
	SessionFactory factory = HibernateUtil.getSessionFactory();

	Session session = factory.openSession();
	
	
			

	
		public Employee1   getEmpByEid() {
			
		Query<Employee1> query =	session.createNamedQuery("getEmpByEid");

		
					query.setParameter(1, 112);
					
			Employee1 emp =		query.getSingleResult();
			
			return emp;
			
			
		}
		
		
		
		
		public List<Employee1>  getAll(){
			
		Query<Employee1>  query =	session.createNamedQuery("getAll");
			
		
			List<Employee1> list =	query.getResultList();
			
			return list;
			
		}
	
}
