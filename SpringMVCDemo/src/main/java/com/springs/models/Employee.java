package com.springs.models;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.springs.validators.PresentOrFuture;




public class Employee {
	
	//@NotNull
	//@Min(1)
	private Integer employeeId;
	
	//@NotEmpty(message="Employee Name is required")
	//@Size(min=3,max=12)
	private String employeeName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//@NotEmpty
	//@Past
	//@Future
	//@PresentOrFuture
	private LocalDate dateOfBirth;
	
	//@Email(message="Email should be proper format")
	//@NotEmpty(message="Email is required")
	private String email;
	
	//@NotEmpty
	//@Pattern(regexp="[6789][0-9]{9}")
	private String contactNumber;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
