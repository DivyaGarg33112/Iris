package com.examples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.RequestScope;


@Controller
public class HelloWorld {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHelloToIris(ModelMap map){
		//I want to share some data from Controller to View
		map.addAttribute("msg","Welcome to Iris Software ");
		return "HomePage";
	}
	
}
