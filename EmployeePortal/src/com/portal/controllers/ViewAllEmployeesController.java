package com.portal.controllers;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/viewAllEmployees")
public class ViewAllEmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		//will call the appropriate Java Bean's or Dao method for request 
		//processing
		EmployeeDao daoObj=new EmployeeDaoImpl();
		List<Employee> empsList=daoObj.getAllEmployee();
		
		request.setAttribute("eList", empsList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllEmployees.jsp");
		rd.forward(request, response);
	}

}

