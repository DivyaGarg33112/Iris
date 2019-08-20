package com.springs.BillingBackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.config.DBConfig;
import com.springs.daos.EmployeeDao;
import com.springs.models.Employee;
import org.junit.*;
import static org.junit.Assert.*;

public class EmployeeTest {

	private static EmployeeDao employeeDao;
	
	@BeforeClass
	public static void init(){
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();	
	context.register(DBConfig.class);
	context.refresh();
	employeeDao=context.getBean("employeeDao",EmployeeDao.class);
	}
	
	@Test
	@Ignore
	public void addEmployeeTest(){
		Employee emp=new Employee();
		emp.setEmployeeName("Abhishek");
		
		boolean r=employeeDao.addEmployee(emp);
		assertTrue("Problem in Adding Employee", r);
		
	}
	
	@Test
	@Ignore
	public void deleteEmployeeTest(){
		//assertTrue(employeeDao.deleteEmployee(105));
		assertTrue("Problem in deleting employee",employeeDao.deleteEmployee(105));
	}
	
	@Test
	public void getEmployeeByIdTest(){
		Employee eObj=employeeDao.getEmployeeById(105);
		System.out.println("Employee object : "+eObj);
		assertNotNull("Employee doesnt exist",eObj);
	}
}




