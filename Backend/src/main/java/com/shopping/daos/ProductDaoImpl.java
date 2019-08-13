package com.shopping.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Product;

@Component
@Repository(value="productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product prod) {
		try
		{
			System.out.println("addP");
			Session session=sessionFactory.getCurrentSession();
			System.out.println("addP1");
			System.out.println(session);
			session.persist(prod);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateProduct(Product prod) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(prod);
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteProduct(int productId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Product p=new Product();
			p.setProductId(productId);
			session.delete(p);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public Product getProduct(int productId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Product p=session.get(Product.class, productId);
			
			return p;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public List<Product> getAllProducts() {
		
		try {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from Product");
		return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
