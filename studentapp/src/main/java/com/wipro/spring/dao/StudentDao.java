package com.wipro.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.wipro.spring.HibernateUtil;
import com.wipro.spring.entity.Student;
@Repository
public class StudentDao {
	
	
	
	
	
	public void save(Student student) {
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session =sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	public List<Student> getAll(){
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session =sessionfactory.openSession();
		List<Student> list=session.createQuery("from Student",Student.class).list();
		session.close();
		return list;
	}

}
