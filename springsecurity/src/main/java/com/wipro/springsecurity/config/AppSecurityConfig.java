package com.wipro.springsecurity.config;

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
	UserDetailsService userDetailsService;
	@Bean
	public UserDetailsService getUserDetailsService() {
	List<UserDetails> userslist=new ArrayList<UserDetails>();
	userslist.add(User.withDefaultPasswordEncoder().username("barbie").password("girl").roles("USER").build());
	userslist.add(User.withDefaultPasswordEncoder().username("prasanna").password("sai").roles("ADMIN").build());
	return new InMemoryUserDetailsManager(userslist);
	}

}
