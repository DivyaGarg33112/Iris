package com.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/MyServlet2" }, 
		initParams = { 
				@WebInitParam(name = "pantrycontact", value = "2400")
		})
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig config=getServletConfig();
		
		/*String a=config.getInitParameter("itcontact");
		String b=config.getInitParameter("pantrycontact");
		
		out.println("<h3 align='center'>For IT support Call Here : "+a+"</h3>");
		out.println("<h3 align='center'>For Pantry support Call Here : "+b+"</h3>");
		out.println("Servlet Name : "+config.getServletName());*/
		
		Enumeration<String> names=config.getInitParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			String value=config.getInitParameter(name);
			out.println("value = "+value);
		}
		
	}

}













