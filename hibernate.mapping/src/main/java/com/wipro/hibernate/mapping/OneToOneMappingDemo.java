package com.wipro.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.mapping.entity.Address;
import com.wipro.hibernate.mapping.entity.Student;

public class OneToOneMappingDemo {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		//one to one mapping
		Address add=new Address(10,"hyd");
		Student std=new Student(101,"ram",add);
		Transaction tx=session.beginTransaction();
		session.persist(std);
		
		 
		
		  Address address = new Address();
		  
		  
		  address.setAddressId(50); address.setCity("Pune");
		  
		  Student student = new Student(105, "ford",address);
		  
		  address.setStudent(student);
		 
		 

		Transaction tr = session.beginTransaction();

		//session.persist(student);
		
		session.persist(address);// insert student obj

		tr.commit();

	}


	

}
