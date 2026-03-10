package com.wipro.mavenspringhibernate.dao;

import java.util.List;

import com.wipro.mavenspringhibernate.entity.Student;

public interface StudentDao {
	void saveStudent(Student student);
	List<Student> getAllStudent();

}
