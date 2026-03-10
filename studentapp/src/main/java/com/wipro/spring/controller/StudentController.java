package com.wipro.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.spring.entity.Student;
import com.wipro.spring.service.StudentService;
import com.wipro.spring.service.StudentServiceImp;

@Controller
public class StudentController {
  private final StudentServiceImp
  service;
  public StudentController(StudentServiceImp service) {
	  this.service=service;
  }
  @GetMapping("/add")
  public String showForm(Model model) {
	model.addAttribute("student",new Student());
	return "register";
  }
  @PostMapping("/save")
  public String saveStudent(@ModelAttribute Student student) {
	  service.saveStudent(student);
	  return "redirect:/students";
  }
  @GetMapping("/students")
  public String viewStudent(Model model) {
	  model.addAttribute("students",service.getAllStudent());
	  return "students";
  }
}
