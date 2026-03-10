package com.wipro.springrestcrud.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.springrestcrud.dto.StudentDTO;
import com.wipro.springrestcrud.entity.Student;
@SpringBootTest
class StudentRestControllerTest {
	@Autowired
	private RestTemplate resttemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddEmp() {
StudentDTO requestbody=new StudentDTO(22,"neha",3243.2);
		
		ResponseEntity<Student> result  =resttemplate.postForEntity("http://localhost:8080/emp/add",requestbody, Student.class);
		Student e=result.getBody();
		assertEquals("neha",e.getEname());
	}

	@Test
	//@Disabled
	void testUpdateemp() {
		StudentDTO d=new StudentDTO(52,"sai ram",2344.2);
		resttemplate.put("http://localhost:8080/emp/update", d);
		assertTrue(d.getSalary()>100);
	}

	@Test
//	@Disabled
	void testSelectAll() {
		ResponseEntity<Student[]> result=	resttemplate.getForEntity("http://localhost:8080/emp/selectAll",Student[].class );
		Student[] l=result.getBody();
		assertNotNull(l);
	}

	@Test
	//@Disabled
	void testGetbyid() {
		int eid=1;
		Student s=	resttemplate.getForObject("http://localhost:8080/emp/getbyid/"+eid, Student.class);
		assertEquals(1,s.getEid());
	}

	//@Test
	//void testFinbyName() {
	//	fail("Not yet implemented");
	//}



	

	


}
