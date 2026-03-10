package com.wipro.springrestcrud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrestcrud.dto.StudentDTO;
import com.wipro.springrestcrud.entity.Student;
import com.wipro.springrestcrud.exception.EmployeeNotFoundException;
import com.wipro.springrestcrud.service.IStudentService;


@RestController
@RequestMapping("/emp")
public class StudentRestController {
	@Autowired
	IStudentService service;
	@GetMapping("/show")
	public String show() {
		return "hi friends";
	}
	@PostMapping("/add")
	public Student addEmp(@RequestBody StudentDTO emp) {
		return service.addEmp(emp); 
	}
	@PutMapping("/update")
	public Student updateemp(@RequestBody StudentDTO emp) {
		return service.updateemp(emp);
	}
    @GetMapping("/selectAll")
    public List<Student> selectAll(){
    	return service.selectAll();
    }
    @GetMapping("/getbyid/{eid}")
    public Student getbyid(@PathVariable int eid) {
    	return service.getbyEid(eid);
    	
    }
    @DeleteMapping("/deletebyid/{eid}")
    public String deletebyid(@PathVariable int eid) {
    	return service.deletebyEid(eid);
    }
    @GetMapping("/findbyname/{ename}")
    public Student finbyName(@PathVariable String ename) throws EmployeeNotFoundException {
    	Student e=service.findbyName(ename);
    	if(e==null) {
    		throw new  EmployeeNotFoundException();
    	}
    	return e;
    }
    @GetMapping("findbyGreaterThan/{salary}")
    public List<Student> findbygreaterthan(@PathVariable double salary){
    	return service.findbyGreaterThan(salary);
    }
    @GetMapping("/findbylessthan/{salary}")
    public List<Student> findbylessthan(@PathVariable double salary){
    	return service.findbysalarylessthan(salary);
    }
    @GetMapping("/getallsort")
    public List<Student> getallsort(){
    	return service.getsort();
    }
    @GetMapping("/sortallquery")
    public List<Student> getsortbyquery(){
    	return service.getsortbyquery();
    }
    @GetMapping("/getallsalarybyrange/{a}/{b}")
    public List<Student> getallsalarybyrange(@PathVariable double a,@PathVariable double b){
    	return service.getbysalarybtwquery(a, b);
    }
    @GetMapping("/getsumbynamedquery")
    public double getsum() {
    	return service.getsumbynamedquery();
    }
 //   @GetMapping("/getcountbynative")
   // public int getcountbynative() {
    //	return service.getcountbynative();
    //}
    @GetMapping("/selectbyeidnamednative/{eid}")
    public Student getbyeidnamed(@PathVariable int eid) {
    	return service.selectbyeidnamednative(eid);
    }
    @PutMapping("updatesalary/{eid}/{salary}")
    public String updatesalary(@PathVariable int eid,@PathVariable  double salary) {
    	service.updatesalary(eid, salary);
    	 return "updated by id "+eid;
    }
  
}

    
	