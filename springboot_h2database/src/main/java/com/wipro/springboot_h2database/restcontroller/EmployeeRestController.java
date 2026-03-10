package com.wipro.springboot_h2database.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot_h2database.dto.EmployeeDTO;
import com.wipro.springboot_h2database.entity.Employee;
import com.wipro.springboot_h2database.service.IEmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeRestController {
	@Autowired
	IEmployeeService service;
	@GetMapping("/show")
	public String show() {
		return "hi friends";
	}
	@PostMapping("/add")
	public Employee addEmp(@RequestBody EmployeeDTO emp) {
		return service.addEmp(emp); 
	}
	@PutMapping("/update")
	public Employee updateemp(@RequestBody EmployeeDTO emp) {
		return service.updateemp(emp);
	}
    @GetMapping("/selectAll")
    public List<Employee> selectAll(){
    	return service.selectAll();
    }
    @GetMapping("/getbyid/{eid}")
    public Employee getbyid(@PathVariable int eid) {
    	return service.getbyEid(eid);
    	
    }
    @DeleteMapping("/deletebyid/{eid}")
    public String deletebyid(@PathVariable int eid) {
    	return service.deletebyEid(eid);
    }
    @GetMapping("/findbyname/{ename}")
    public Employee finbyName(@PathVariable String ename) {
    	return service.findbyName(ename);
    }
    @GetMapping("findbyGreaterThan/{salary}")
    public List<Employee> findbygreaterthan(@PathVariable double salary){
    	return service.findbyGreaterThan(salary);
    }
    @GetMapping("/findbylessthan/{salary}")
    public List<Employee> findbylessthan(@PathVariable double salary){
    	return service.findbysalarylessthan(salary);
    }
    @GetMapping("/getallsort")
    public List<Employee> getallsort(){
    	return service.getsort();
    }
    @GetMapping("/sortallquery")
    public List<Employee> getsortbyquery(){
    	return service.getsortbyquery();
    }
    @GetMapping("/getallsalarybyrange/{a}/{b}")
    public List<Employee> getallsalarybyrange(@PathVariable double a,@PathVariable double b){
    	return service.getbysalarybtwquery(a, b);
    }
    @GetMapping("/getsumbynamedquery")
    public double getsum() {
    	return service.getsumbynamedquery();
    }
    @GetMapping("/getcountbynative")
    public int getcountbynative() {
    	return service.getcountbynative();
    }
    @GetMapping("/selectbyeidnamednative/{eid}")
    public Employee getbyeidnamed(@PathVariable int eid) {
    	return service.selectbyeidnamednative(eid);
    }
    @PutMapping("updatesalary/{eid}/{salary}")
    public String updatesalary(@PathVariable int eid,@PathVariable  double salary) {
    	service.updatesalary(eid, salary);
    	 return "updated by id "+eid;
    }
  
}
