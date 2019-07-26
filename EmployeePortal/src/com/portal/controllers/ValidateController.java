package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;

@WebServlet("/validate")
public class ValidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Has taken the request
		int empid=Integer.parseInt(request.getParameter("empid"));
		String pass=request.getParameter("emppass");
	
		//will call the appropriate Java Bean's or Dao method for request 
		//processing
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.validate(empid, pass);
		
		//Now according to the request , Controller will display
		//the appropriate view.
		if(r){
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);

			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
		
	}

}
