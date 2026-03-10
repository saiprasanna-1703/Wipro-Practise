package com.wipro.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.spring.dao.StudentDao;
import com.wipro.spring.entity.Student;
@Service
public class StudentServiceImp  implements StudentService{
	private final StudentDao dao;
	public StudentServiceImp(StudentDao dao) {
		this.dao=dao;
	}


@Override
public void saveStudent(Student student) {
	// TODO Auto-generated method stub
	dao.save(student);
}

@Override
public List<Student> getAllStudent() {
	// TODO Auto-generated method stub
	return dao.getAll();
}

}
