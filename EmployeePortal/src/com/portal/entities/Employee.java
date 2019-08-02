package com.portal.entities;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;

//POJO
public class Employee implements HttpSessionBindingListener{
	
	private int employeeId;
	private String employeeName;
	private String gender;
	private String qualification;
	private String contactNo;
	private String emailAddress;
	private String password;
	private String role;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/*This method will be called when an object of Employee is added
	 * to the session*/
	@Override
	public void valueBound(HttpSessionBindingEvent e) {
		Employee emp=(Employee)e.getValue();
		String cNo=emp.getContactNo();
		if(!cNo.startsWith("+91")){
			emp.setContactNo("+91"+cNo);
		}
		
	}
	
	/*This method will be called when an object of Employee is remove
	 * from the session either by calling session.removeAttribute() or 
	 * by calling session.invalidate() or session has been time out*/
	@Override
	public void valueUnbound(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
