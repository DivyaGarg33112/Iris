package com.shopping.daos;

import java.util.List;

import com.shopping.entity.Product;

public interface ProductDao {
	
	public boolean addProduct(Product prod);
	public boolean updateProduct(Product prod);
	public boolean deleteProduct(int productId);
	public Product getProduct(int productId);
	public List<Product> getAllProducts();

}
