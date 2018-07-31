package com.bigdog.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigdog.pojo.DogResource;
import com.bigdog.pojo.JSONResult;
import com.bigdog.pojo.User;

@RestController
public class HelloController {

	@Autowired
	private DogResource dogResource;
	
	@RequestMapping("/hello")
	public 	Object hello()
	{
		return "helloe springboot";
		
	}
	
	@RequestMapping("/getUser")
	public JSONResult getUser()
	{
		User user = new User();
		user.setAge(27);
		user.setName("张博伦");
		return JSONResult.ok(user);
		
	}
	
	@RequestMapping("/getResource")
	public JSONResult getResource()
	{
		DogResource r = new DogResource();
		BeanUtils.copyProperties(dogResource, r);
		return JSONResult.ok(r);
	}
}
