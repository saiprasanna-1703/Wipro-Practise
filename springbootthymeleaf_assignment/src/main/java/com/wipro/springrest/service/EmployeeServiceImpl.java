package com.wipro.springrest.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springrest.entity.Student;
import com.wipro.springrest.repository.StudentRepository;

@Service
public class EmployeeServiceImpl
    implements IEmployeeServices {
  
    @Autowired private StudentRepository empRepo;

    @Override public List<Student> getAllEmployee()
    {
        return empRepo.findAll();
    }

    @Override public void save(Student employee)
    {
        empRepo.save(employee);
    }

    @Override public Student getById(int id)
    {
        Optional<Student> optional = empRepo.findById(id);
        Student employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
    }

    @Override public void deleteViaId(int id)
    {
        empRepo.deleteById(id);
    }
}