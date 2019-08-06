package com.iris.practice;

import java.util.HashSet;
import java.util.Set;

import com.iris.daos.CustomerDao;
import com.iris.daos.CustomerDaoImpl;
import com.iris.models.Address;
import com.iris.models.Customer;

public class CustomerMain {
	public static void main(String[] args){
		
	CustomerDao customerDao=new CustomerDaoImpl();
	
	
	Address addr1=new Address("11","Paras Society","Greater Noida","Uttar Pradesh");
	Address addr2=new Address("Flat no - 39","ABC Society","Kolkata","West Bengal");
	Address addr3=new Address("Plot no - 1","Jai Mata di Societies","Kolkata","West Bengal");
	
	Set<Address> addressSet=new HashSet<>();
	addressSet.add(addr1);
	addressSet.add(addr2);
	addressSet.add(addr3);
	
	Customer c=new Customer();
	c.setEmail("pramit@gmail.com");
	c.setName("Pramit");
	c.setContactNo("7458965896");
	c.setAddresses(addressSet);
		
	System.out.println(customerDao.addCustomer(c));
	
		
	}
}
