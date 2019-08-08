package com.examples.mains;

import com.examples.dao.EmployeeDao;
import com.examples.dao.EmployeeDaoImpl;
import com.examples.models.Department;
import com.examples.models.Employee;

public class ManyToOneDemo {

	public static void main(String[] args) {
	
	
	EmployeeDao eDao=new EmployeeDaoImpl();
	
	Department d=new Department();
	d.setDepartmentId("HR");
	d.setDepartmentName("Human Resources");
	
	Employee e=new Employee();
	e.setEmployeeName("Radhey");
	e.setDept(d);
	
	eDao.addEmployee(e);		
	}

}
