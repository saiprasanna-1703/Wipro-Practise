package com.wipro.springboot_exceptionhandler.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> divbyzero(ArithmeticException e){
		return new ResponseEntity<String>(new String("number cannot divide by zero"),HttpStatus.NOT_ACCEPTABLE);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exception(Exception e){
		return new ResponseEntity<String>(new String("oops,exception occurs"),HttpStatus.NOT_ACCEPTABLE);
		
	}

}
