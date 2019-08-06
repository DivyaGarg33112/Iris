package com.iris.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.models.Customer;
import com.iris.providers.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public boolean addCustomer(Customer customer) {
		try{
		SessionFactory sf=SessionFactoryProvider.getSF();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(customer);
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
		try{
			SessionFactory sf=SessionFactoryProvider.getSF();
			Session session=sf.openSession();
			Customer obj=session.get(Customer.class, email);
			return obj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		try{
			SessionFactory sf=SessionFactoryProvider.getSF();
			Session session=sf.openSession();
			Query<Customer> query=session.createQuery("from Customer");
			List<Customer> customers=query.getResultList();
			 return customers;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
