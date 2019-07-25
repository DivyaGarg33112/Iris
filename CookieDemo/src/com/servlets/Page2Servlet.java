package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//fetch the request parameters
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		
		
		Cookie cookie1=new Cookie("fn",firstname);
		Cookie cookie2=new Cookie("ln",lastname);
		
		//cookie1.setMaxAge(expiry);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		
		out.println("<div align='center'><h1>Page 2</h1><form action='page3' ><table border='1'><tr><td>Email : </td><td><input type='text' name='email'></td></tr><tr><td>Password : </td><td><input type='text' name='pass'></td></tr><tr><td colspan='2'><input type='submit' value='Go to Page 2'></td></tr></table></form></div>");
		
		
	}

}
