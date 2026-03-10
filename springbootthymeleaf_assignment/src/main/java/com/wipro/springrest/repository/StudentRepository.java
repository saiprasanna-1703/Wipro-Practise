package com.wipro.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springrest.entity.Student;

public interface StudentRepository extends  JpaRepository<Student, Integer> {



}
