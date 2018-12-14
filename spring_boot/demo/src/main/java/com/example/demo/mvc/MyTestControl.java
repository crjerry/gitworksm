package com.example.demo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestControl {
	
	@RequestMapping("/hello")
	public String test()
	{
	return "hello, java!";	
	}

}
