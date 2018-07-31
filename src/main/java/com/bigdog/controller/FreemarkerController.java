package com.bigdog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdog.pojo.DogResource;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {

	@Autowired
	private DogResource resource;
	@RequestMapping("/index")
	public String goIndex()
	{
		return "freemarker/index";
	}
	
	@RequestMapping("/center")
	public String goCenter(ModelMap model)
	{
		model.addAttribute("resource", resource);
		return "freemarker/center";
	}
}
