package com.bigdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/err")
public class ErrorController {

	@RequestMapping("/error")
	public String error() {
		
		int a = 1 / 0;
		
		return "thymeleaf/error";
	}
	
}
