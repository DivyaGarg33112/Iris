package com.examples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examples.daos.CategoryDao;
import com.examples.models.Category;


@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao categoryDao;

	@RequestMapping(value="getCategoryForm",method=RequestMethod.GET)
	public String fetchCategoryForm(ModelMap map){
		Category category=new Category();
		map.addAttribute("categoryObj",category);
		return "CategoryForm";
	}
	
	@RequestMapping(value="addCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category categoryObj){
		categoryDao.addCategory(categoryObj);
		return "ViewCategory";
	}
}




