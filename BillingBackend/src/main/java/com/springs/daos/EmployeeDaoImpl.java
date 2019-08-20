package com.springs.daos;


import java.util.List;

import oracle.net.aso.q;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springs.models.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addEmployee(Employee emp) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.persist(emp);
		return true;
		}
		catch(Exception e){
		e.printStackTrace();
		return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		Session session=sessionFactory.getCurrentSession();
		session.update(emp);
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		Session session=sessionFactory.getCurrentSession();
		Employee empObj=session.get(Employee.class,employeeId);
		if(empObj==null){
		return false;
		}
		session.delete(empObj);
		return true;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		System.out.println("Hello 1");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Hello 2");
		Employee empObj=session.get(Employee.class,employeeId);
		System.out.println("Hello 3");
		System.out.println("empObj in Dao impl : "+empObj);
		return empObj;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Session session=sessionFactory.getCurrentSession();
		Query<Employee> query=session.createQuery("from Employee");
		List<Employee>  emps=query.getResultList();
		return emps;
	}

}
