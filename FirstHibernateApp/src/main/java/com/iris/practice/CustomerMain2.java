package com.iris.practice;

import com.iris.daos.CustomerDao;
import com.iris.daos.CustomerDaoImpl;
import com.iris.models.Address;
import com.iris.models.Customer;

public class CustomerMain2 {
	public static void main(String[] args){
		
	CustomerDao customerDao=new CustomerDaoImpl();
	
	/*Customer obj=customerDao.getCustomerById("divya@gmail.com");
	if(obj==null){
		System.out.println("Customer with the given email doesnt exist");
	}
	else {
		System.out.println("\n=========Customer Details========");
		System.out.println("Name : "+obj.getName());
		System.out.println("Email : "+obj.getEmail());
		System.out.println("Contact No : "+obj.getContactNo());
		
		Address present=obj.getPresentAddress();
		System.out.println(present);
	}*/
	
		
	}
}
