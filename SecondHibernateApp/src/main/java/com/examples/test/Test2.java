package com.examples.test;

import java.util.ArrayList;
import java.util.List;

import com.examples.daos.CustomerDao;
import com.examples.daos.CustomerDaoImpl;
import com.examples.models.Address;
import com.examples.models.Customer;

public class Test2 {

	public static void main(String[] args) {
		
	CustomerDao cDao=new CustomerDaoImpl();
	
	Customer cObj=cDao.getCustomerById("nilam@gmail.com");
	
	System.out.println("Name : "+cObj.getName());
	System.out.println("Email : "+cObj.getEmail());
	System.out.println("Contact : "+cObj.getContactNumber());
	
	List<Address> addrList=cObj.getListOfAddresses();
	for(Address aObj:addrList){
		System.out.println(aObj.getAddressLine1()+" "+aObj.getAddressLine2());
	}
	}

}
