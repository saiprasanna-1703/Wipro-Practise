package com.wipro.hibernate_mappingmine;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate_mappingmine.entity.Customer_order;
import com.wipro.hibernate_mappingmine.entity.Restaurant_Menu;



public class OneToOne {
	public static void main(String[] args) {
   Session session=HibernateUtil.getSessionFactory().openSession();
  // Restaurant_Menu rm=new Restaurant_Menu(101,"biriryani");
  
   //Customer_order co=new Customer_order(1,"biriryani",2000,rm);
   //bi directional
   Restaurant_Menu rm1=new Restaurant_Menu(102,"rice");
   Customer_order co1=new Customer_order(2,"rice",100,rm1);
   rm1.setCustomer_order(co1);
   Transaction tx=session.beginTransaction();
   session.persist(rm1);
 //session.save(co);
 tx.commit();
 }
}
