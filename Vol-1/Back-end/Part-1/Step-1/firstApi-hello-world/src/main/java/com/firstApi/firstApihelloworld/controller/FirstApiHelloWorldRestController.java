package com.firstApi.firstApihelloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController  
public class FirstApiHelloWorldRestController {

	@RequestMapping("/")  
	public String hello()   
	{  	
		return "Hello Api REST world";  	
	}  
}


