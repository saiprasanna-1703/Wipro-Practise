package com.wipro.hibernate1_demo;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernate1_demo.entity.Employee1;

public class SessionCreateQuery {
	public static void main(String[] args) {
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session= sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		//single record selecting
		String selectAll="select e from Employee1 e where eid=?1";
		Query<Employee1> q=session.createQuery(selectAll,Employee1.class);
		q.setParameter(1, 2);
		List<Employee1> list1=q.getResultList();
		for(Employee1 employee:list1) {
			System.out.println(employee);
		}
		
		//for all
		String query="select e from Employee1 e where price between  :low and :high";
		Query<Employee1> qr=session.createQuery(query,Employee1.class);
		qr.setParameter("low", 10000.00);
		qr.setParameter("high", 30000.00);
		List<Employee1> list=qr.getResultList();
		for(Employee1 employee:list) {
			System.out.println(employee);
		}
		tx.commit();
		
		}
	
		


}
