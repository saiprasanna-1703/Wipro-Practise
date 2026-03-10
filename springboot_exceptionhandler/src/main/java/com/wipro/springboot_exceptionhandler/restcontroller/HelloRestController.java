package com.wipro.springboot_exceptionhandler.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class HelloRestController {
	
	@GetMapping("/add")
	public String shownae() {
		String name=null;
		return "hello "+name.toUpperCase();
	}
	@GetMapping("/show/{a}/{b}")
	public String div(@PathVariable int a,@PathVariable int b) {
		int c=a/b;
		return c+" is result";
		
	}
	//@ExceptionHandler(NullPointerException.class)
   //@ResponseStatus(reason=" name cannot be null", value=HttpStatus.NOT_FOUND)
//	public void handleexc(NullPointerException n) {
		
	//}
	
	//@ExceptionHandler(ArithmeticException.class)
	//public ResponseEntity<String> notdivideble(){
		//return new ResponseEntity<String>(new String("denominator cannot be divided by zero"),HttpStatus.NOT_ACCEPTABLE);
//	}
	
	
	
	

}
