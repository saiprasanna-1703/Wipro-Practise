package com.wipro.springrestcrud.servie;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;
@SpringBootTest
class EmployeeServiceImpTest extends EmployeeServiceImp {
	@Autowired
	IEmployeeService service;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	//@Rollback(false)
	//@Disabled
	void testAddEmp() {
		EmployeeDTO d=new EmployeeDTO(11,"kishore",4353.67);
		service.addEmp(d);
		System.out.print("record addedd");
		assertEquals(11,d.getEid());
		
		
	}

	@Test
	//@Disabled
	void testSelectAll() {
		
		List<Employee> f=service.selectAll();
		assertNotNull(f);
	}

	@Test
//	@Disabled
	void testGetbyEid() {
		Employee f=service.getbyEid(100);
		assertNull(f);
				
	}

	@Test
	//@Disabled
	void testFindbyName() {
		Employee e=service.findbyName("sai");
		assertTrue(e.getSalary()>100);
	}

}
