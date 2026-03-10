package com.wipro.springrestcrud.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.wipro.springrestcrud.dto.StudentDTO;
import com.wipro.springrestcrud.entity.Student;

@SpringBootTest
class StudentServiceImpTest extends StudentServiceImp 
{
  @Autowired
  IStudentService service;
  
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
//	@Disabled
	//@Rollback(false)
	void testAddEmp() {
		
		StudentDTO s=new StudentDTO(99,"lokesh",100.2);
		service.addEmp(s);
		
		assertEquals(99,s.getEid());
	}

	@Test
	//@Disabled
	void testSelectAll() {
		List<Student> s=service.selectAll();
		assertNotNull(s);
		
	}

	@Test
	//@Disabled
	void testGetbyEid() {
         Student s=service.getbyEid(1);
         assertTrue(s.getSalary()>500);
	}

	@Test
	//@Disabled
	void testFindbyName() {
		Student m=service.findbyName("govinda");
		assertNull(m);
		
	}

	//@Test
	//@Disabled
	//void testGetcountbynative() {
		//int a=service.getcountbynative();
		//assertEquals(8,a);
	//}

}
