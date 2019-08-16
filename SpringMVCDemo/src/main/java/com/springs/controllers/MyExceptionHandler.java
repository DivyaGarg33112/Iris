package com.springs.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex)
	{
	    ModelAndView modelAndView = new ModelAndView("error");
	    modelAndView.addObject("message", ex.getMessage());
	    return modelAndView;
	}
}
