package com.wipro.springrest.service;

import java.util.List;

import com.wipro.springrest.entity.Student;

public interface IEmployeeServices {
    List<Student> getAllEmployee();
    void save(Student student);
    Student getById(int id);
    void deleteViaId(int id);
}
