package com.frontend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.daos.CategoryDao;
import com.shopping.entity.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value="/categoryForm",method=RequestMethod.GET)
	public ModelAndView getCategoryForm(){
		/*ModelAndView is a class which can encapsulate View name to be 
		 * rendered and data that we want to share from Controller to the
		 * View*/
		
		/*Here CategoryForm  is the View*/
		ModelAndView mv=new ModelAndView("CategoryForm");
		
		//This is the data we want to share
		mv.addObject("cObj",new Category());
		mv.addObject("btnLabel","Add Category");
		mv.addObject("frmLabel","Add Category Form");
		return mv;
	}
	
	@RequestMapping(value="/submitCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category cObj,ModelMap map){
		if(cObj.getCategoryId()==0){
			categoryDao.addCategory(cObj);
			map.addAttribute("msg","Category Added Succesfully");
		}
		else {
			categoryDao.updateCategory(cObj);
			map.addAttribute("msg","Category Updated Succesfully");
		}
		List<Category> categoryList=categoryDao.getAllCategories();
		map.addAttribute("categories",categoryList);
		return "ViewCategories";
		
	}
	
	@RequestMapping(value="/viewCategories",method=RequestMethod.GET)
	public String getAllCategories(ModelMap map){
			List<Category> categoryList=categoryDao.getAllCategories();
			map.addAttribute("categories",categoryList);
			return "ViewCategories";
		
	}
	
	@RequestMapping(value="/deleteCategory/{catId}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable int catId,ModelMap map){
		categoryDao.deleteCategory(catId);
		map.addAttribute("msg","Category Deleted Succesfully");
		List<Category> categoryList=categoryDao.getAllCategories();
		map.addAttribute("categories",categoryList);
		return "ViewCategories";
	
	}
	
	@RequestMapping(value="/updateCategory/{catId}",method=RequestMethod.GET)
	public String updateCategoryForm(@PathVariable int catId,ModelMap map){
		Category cObj=categoryDao.getCategory(catId);
		map.addAttribute("cObj",cObj);
		map.addAttribute("btnLabel","Update Category");
		map.addAttribute("frmLabel","Update Category Form");
		
		return "CategoryForm";
	
	}
	
}













