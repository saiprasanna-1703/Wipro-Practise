package com.wipro.spring_rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.spring_rest.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmpRestController {
	@GetMapping("/hello")
	public String sayhello() {
		return "hello world";
	}
	@PostMapping("/add")
	public String addemp(@RequestBody Employee emp) {
		return "1 row added"+emp;
	}
	@PutMapping("/update")
	public String upemp(@RequestBody Employee emp ) {
		return "1 row updated"+emp;
	}
	@DeleteMapping("/delete/{eid}")
	public String delemp(@PathVariable int eid) {
		return "1 row deleted"+eid;
	}

}
