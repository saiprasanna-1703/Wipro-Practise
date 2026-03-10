package com.wipro.springrestcrud.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.springrestcrud.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> employenot(){
		return new ResponseEntity<String>(new String("employee not found"),HttpStatus.NOT_ACCEPTABLE);
	}

}
