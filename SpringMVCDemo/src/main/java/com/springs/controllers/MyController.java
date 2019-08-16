package com.springs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/demo/not-exist", method = RequestMethod.GET,  headers="Accept=*/*")
	public ModelAndView oneFaultyMethod()
	{   
	    throw new NullPointerException("This error message if for demo only.");
	    
	}
	
	@RequestMapping(value="/demo/divide", method = RequestMethod.GET,  headers="Accept=*/*")
	public String anotherFaultMethod(@RequestParam(name="t1")int num1,@RequestParam(name="t2")int num2,ModelMap map){
		int sum=num1/num2;
		map.addAttribute("result",sum);
		return "result";
		
	}
	
	@RequestMapping(value="/demo/printName",method=RequestMethod.GET)
	public String thirdFaultyMethod(@RequestParam(name="t1")String name){
		if(name.length()<3){
			throw new SpringException("Name is too short..");
		}
		return "HomePage";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex)
	{
	    ModelAndView modelAndView = new ModelAndView("error");
	    modelAndView.addObject("message", ex.getMessage());
	    return modelAndView;
	}
	

}
