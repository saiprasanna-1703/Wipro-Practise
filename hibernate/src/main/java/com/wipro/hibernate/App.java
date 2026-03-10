package com.wipro.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.entity.Employee1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	System.out.println("hello world");
    	SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
    	Session session=sessionfactory.openSession();
    	System.out.println(session);
    	Transaction tx=session.beginTransaction();
    	 //	inserting 
    //	Employee1 emp=new Employee1();
   
    //	emp.setEid(1);
    //	emp.setName("govinda");
    //	emp.setPrice(1000000);
    //	Serializable  se=session.save(emp);
    	//System.out.println("i row is insertedd."+se);
    	//updating
    	Employee1 empl=session.get(Employee1.class, 1);
    //	System.out.println(empl+"before updating..");
    	//empl.setPrice(99999999);
    //	session.saveOrUpdate(empl);
    	//System.out.println(session.get(Employee1.class, 1)+"after updatinggg..");
    	//deletingg...
    	session.delete(empl);;
    	
    	
    	
    	tx.commit();
    	
    }
   
}
