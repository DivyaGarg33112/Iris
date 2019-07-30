package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Has taken the request
		String name=request.getParameter("ename");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String contactNo=request.getParameter("contactNo");
		String qualification=request.getParameter("qualification");
		String pass=request.getParameter("emppass");
	
		
		Employee emp=new Employee();
		emp.setContactNo(contactNo);
		emp.setEmailAddress(email);
		emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setQualification(qualification);
		emp.setPassword(pass);
		
		//will call the appropriate Java Bean's or Dao method for request 
		//processing
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.register(emp);
		
		//Now according to the request , Controller will display
		//the appropriate view.
		if(r){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			
			if(r){
				request.setAttribute("msg","User Registered Succesfully...");
				RequestDispatcher rd=request.getRequestDispatcher("LoginForm.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("msg","Problem in doing registration . Try again...");
				
				RequestDispatcher rd=request.getRequestDispatcher("RegistrationForm.jsp");
				rd.forward(request, response);
			}

			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
		
	}

}
