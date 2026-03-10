package com.wipro.hibernate1_demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.wipro.hibernate1_demo.entity.Employee1;

public class CriteriaQueryDemo {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Criteria query=session.createCriteria(Employee1.class);
		query.add(Restrictions.eq("price",20000.00));
		List list=query.list();
		System.out.println(list);
		
	}

}
