package com.examples.mains;

import com.examples.dao.UserDao;
import com.examples.dao.UserDaoImpl;
import com.examples.dao.VehicleDao;
import com.examples.dao.VehicleDaoImpl;
import com.examples.models.User;
import com.examples.models.Vehicle;

public class Main {

	public static void main(String[] args) {
	
	UserDao userDao=new UserDaoImpl();
	
	User userObj=new User();
	userObj.setContactNo("74859685968");
	userObj.setEmail("tushar@iris.com");
	userObj.setRole("Admin");
	userObj.setUserName("Tushar Sharma");
	
	Vehicle v=new Vehicle();
	v.setCompany("Maruti");
	v.setVehicleColor("Red");
	v.setVehicleNumber("DL l5 7485");
	v.setVehicleType("Four Wheeler");
	
	v.setUserObj(userObj);
	userObj.setVehicleObj(v);
	
	userDao.addUser(userObj);
	System.out.println("Vehicle Added");
	
	}

}
