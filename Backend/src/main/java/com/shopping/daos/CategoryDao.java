package com.shopping.daos;

import java.util.List;

import com.shopping.entity.Category;
import com.shopping.entity.Product;

public interface CategoryDao {
	
	public boolean addCategory(Category cat);
	public boolean updateCategory(Category cat);
	public boolean deleteCategory(int categoryId);
	public Category getCategory(int categoryId);
	public List<Category> getAllCategories();

}
