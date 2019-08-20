package com.springs.daos;

import java.util.List;

import com.springs.models.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee emp);
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int employeeId);
	public Employee getEmployeeById(int employeeId);
	public List<Employee> getAllEmployees();
}
