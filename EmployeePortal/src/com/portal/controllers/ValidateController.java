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
		Employee r=daoObj.validate(empid, pass);
		
		//Now according to the request , Controller will display
		//the appropriate view.
		if(r!=null){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			
			if(r.getRole().equals("Admin")){
				RequestDispatcher rd=request.getRequestDispatcher("AdminSuccess.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
				rd.forward(request, response);
			}

			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
		
	}

}
