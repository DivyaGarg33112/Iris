package com.examples.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.examples.models.Customer;
import com.examples.providers.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public boolean addCustomer(Customer c) {
		try {
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(c);
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
	public Customer getCustomerById(String email) {
		try {
			SessionFactory sf=SessionFactoryProvider.getSessionFactory();
			Session session=sf.openSession();
			Customer cust=session.get(Customer.class,email);
			return cust;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		try {
			SessionFactory sf=SessionFactoryProvider.getSessionFactory();
			Session session=sf.openSession();
			Query<Customer> query=session.createQuery("from Customer");
			List<Customer> customerList= query.getResultList();
			return customerList;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
