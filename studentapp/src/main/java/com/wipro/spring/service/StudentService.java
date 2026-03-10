package com.wipro.spring.service;

import java.util.List;

import com.wipro.spring.entity.Student;

public interface StudentService {
	void saveStudent(Student student);
	List<Student> getAllStudent();

}
