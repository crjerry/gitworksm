package com.example.demo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
public class SampleController 
{
	@RequestMapping(value = "/testNumber", method = RequestMethod.GET)
	public String test(@RequestParam(value="number", required=true, defaultValue="0") String input)
	{
		switch(input)
		{
				case "1":
					return "One";
				case "2":
					return "Two";
				case "3":
					return "Three";
				default:
					return "Zero";
		}
	}
}
