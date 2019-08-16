package com.springs.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springs.models.Employee;
import com.springs.validators.NameValidator;


@Controller
/*@RequestMapping("/employee")*/
public class PageController {

	@Autowired
	NameValidator nameValidator;
	
	@RequestMapping(value={"/","home"},method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		ModelAndView mv=new ModelAndView("HomePage");
		mv.addObject("msg","Iris Software");
		return mv;
	}
	
	@RequestMapping(value="/getEmployeeForm",method=RequestMethod.GET)
	public ModelAndView getEmployeeForm(){
		ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("empObj",new Employee());
		return mv;
	}
	
	@RequestMapping(value="/getEmployeeForm",method=RequestMethod.POST)
	public ModelAndView addEmployee(@Valid @ModelAttribute(name="empObj") Employee empObj,
			BindingResult result){
		
		nameValidator.validate(empObj, result);
		
		if(result.hasErrors()){
			ModelAndView mv=new ModelAndView("EmployeeForm");
			//mv.addObject("empObj",empObj);
			return mv;
		}
		ModelAndView mv=new ModelAndView("ViewEmployee");
		return mv;
	}
}
