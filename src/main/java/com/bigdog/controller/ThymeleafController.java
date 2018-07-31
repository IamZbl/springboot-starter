package com.bigdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thy")
public class ThymeleafController {

	@RequestMapping("/index")
	public String goIndex(ModelMap model)
	{
		model.addAttribute("name", "ZBL");
		return "thymeleaf/index";
	}
}
