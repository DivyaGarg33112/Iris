package com.examples.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.models.Employee;
import com.examples.providers.SessionFactoryProvider;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean addEmployee(Employee obj) {
		try {
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return false;
	}



}
