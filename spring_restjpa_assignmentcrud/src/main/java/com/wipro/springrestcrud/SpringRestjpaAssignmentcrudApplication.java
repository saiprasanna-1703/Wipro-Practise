package com.wipro.springrestcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestjpaAssignmentcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestjpaAssignmentcrudApplication.class, args);
	}
	@Bean
	public RestTemplate gettemplate() {
		return new RestTemplate();
	}

}
