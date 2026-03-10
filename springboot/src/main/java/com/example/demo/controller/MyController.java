package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class MyController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "<h1>HELLO WORLD</h1>";
	}

}
