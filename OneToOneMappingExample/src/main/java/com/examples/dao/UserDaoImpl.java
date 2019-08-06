package com.examples.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.examples.models.User;
import com.examples.providers.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User userObj) {
		try {
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(userObj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public User getUserById(int id) {
		try {
			SessionFactory sf=SessionFactoryProvider.getSessionFactory();
			Session session=sf.openSession();
			User userObj=session.get(User.class,id);
			return userObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
