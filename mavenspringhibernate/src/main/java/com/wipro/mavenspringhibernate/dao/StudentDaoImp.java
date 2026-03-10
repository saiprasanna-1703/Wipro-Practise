package com.wipro.mavenspringhibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.mavenspringhibernate.entity.Student;
@Repository
public class StudentDaoImp implements StudentDao {
	private SessionFactory sessionfactory;
	 @Autowired
	 StudentDaoImp(SessionFactory sessionFactory){
		 this.sessionfactory=sessionFactory;
	 }

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
