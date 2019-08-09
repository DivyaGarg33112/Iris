package com.examples.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examples.models.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addCategory(Category obj) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.save(obj);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}

}
