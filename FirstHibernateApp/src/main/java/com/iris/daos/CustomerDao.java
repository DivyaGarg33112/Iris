package com.iris.daos;

import java.util.List;

import com.iris.models.Customer;

public interface CustomerDao {

	public boolean addCustomer(Customer customer);
	public Customer getCustomerById(String email);
	public List<Customer> getAllCustomers();
	
}
