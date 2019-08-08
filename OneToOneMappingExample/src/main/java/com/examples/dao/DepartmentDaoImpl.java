package com.examples.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.models.Department;
import com.examples.models.Employee;
import com.examples.providers.SessionFactoryProvider;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public boolean addDepartment(Department obj) {
		try {
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(obj);
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
