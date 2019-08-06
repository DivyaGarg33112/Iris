package com.examples.daos;

import java.util.List;

import com.examples.models.Customer;

public interface CustomerDao {
	public boolean addCustomer(Customer c);
	public Customer getCustomerById(String email);
	public List<Customer> getAllCustomers();
}	
