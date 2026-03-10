package com.wipro.springhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.springhibernate.entity.Properties;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/estore")
public class ProductController{
	private final Properties properties;
	ProductController(Properties properties){
		this.properties=properties;
	}
	@RequestMapping(value="/show", method=RequestMethod.POST)
	public String showproperties(@ModelAttribute Properties properties,HttpSession session) {
		session.setAttribute("Properties", properties);
		return "display";
	}
	
}