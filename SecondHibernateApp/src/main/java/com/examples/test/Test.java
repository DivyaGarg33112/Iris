package com.examples.test;

import java.util.ArrayList;
import java.util.List;

import com.examples.daos.CustomerDao;
import com.examples.daos.CustomerDaoImpl;
import com.examples.models.Address;
import com.examples.models.Customer;

public class Test {

	public static void main(String[] args) {
		
	CustomerDao cDao=new CustomerDaoImpl();
	
	
	List<Address> addr=new ArrayList<>();
	addr.add(new Address("Sector - 137 , Paras Society","Greater Noida"));
	addr.add(new Address("Sector - 55 , Golf Course"," Noida"));
	
	Customer custObj=new Customer();
	custObj.setEmail("nilam@gmail.com");
	custObj.setName("Nilam shaw");
	custObj.setContactNumber("8574968596");
	custObj.setListOfAddresses(addr);

	System.out.println(cDao.addCustomer(custObj));
	
	}

}
