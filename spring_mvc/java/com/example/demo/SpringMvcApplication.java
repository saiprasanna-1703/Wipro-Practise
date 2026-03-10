package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Product;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Product p=context.getBean("e",Product.class);
		System.out.println(p);
	}

}
