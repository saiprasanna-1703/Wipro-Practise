package com.wipro.springrestcrud.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Autowired
	UserDetailsService userdetailsService;
	@Bean
	public UserDetailsService getuserdetails() {
		List<UserDetails> user=new ArrayList<UserDetails>();
		user.add(User.withDefaultPasswordEncoder().username("sai").password("prasanna").roles("ADMIN").build());
		return new InMemoryUserDetailsManager();

		}

}
