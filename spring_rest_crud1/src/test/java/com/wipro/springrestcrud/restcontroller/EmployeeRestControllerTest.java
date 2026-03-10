package com.wipro.springrestcrud.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;
@SpringBootTest
class EmployeeRestControllerTest {
	@Autowired
	private RestTemplate resttemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	//@Disabled
	void testAddEmp() {
		EmployeeDTO requestbody=new EmployeeDTO(22,"neha",3243.2);
		
		ResponseEntity<Employee> result  =resttemplate.postForEntity("http://localhost:8080/api/employee/add",requestbody, Employee.class);
		Employee e=result.getBody();
		assertEquals("neha",e.getEname());
	}

	@Test
	//@Disabled
	//@Rollback(false)
	void testUpdateemp() {
		EmployeeDTO d=new EmployeeDTO(53,"sai ram",2344.2);
		resttemplate.put("http://localhost:8080/api/employee/update", d);
		assertTrue(d.getSalary()>100);
		
	}

	@Test
	//@Disabled
	void testSelectAll() {
	ResponseEntity<Employee[]> result=	resttemplate.getForEntity("http://localhost:8080/api/employee/selectAll",Employee[].class );
	Employee[] l=result.getBody();
	assertNotNull(l);
	}

	@Test
	//@Disabled
	void testGetbyid() {
		int eid=1;
	Employee s=	resttemplate.getForObject("http://localhost:8080/api/employee/getbyid/"+eid, Employee.class);
	assertEquals(1,s.getEid());
	}

}
