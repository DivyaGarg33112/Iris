package com.shopping.daos;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Category;


@Component
@Repository(value="categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addCategory(Category cat) {
		try {
			
			Session session=sessionFactory.getCurrentSession();
			session.persist(cat);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	

	public boolean updateCategory(Category cat) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(cat);
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteCategory(int categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=new Category();
			c.setCategoryId(categoryId);
			session.delete(c);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public List<Category> getAllCategories() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from Category");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}



	public Category getCategory(int categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=session.get(Category.class, categoryId);
			return c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
