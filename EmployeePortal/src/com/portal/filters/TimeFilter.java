package com.portal.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/HomePage.jsp")
public class TimeFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("I m init");
	}
	
	public void destroy() {
		System.out.println("I m destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Preprocessing");
		
		chain.doFilter(request,response);
		
		System.out.println("Postprocessing");
		
		/*HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		PrintWriter out=res.getWriter();
		
		LocalDateTime ldt=LocalDateTime.now();
		int hr=ldt.getHour();
		
		System.out.println("Hour = "+hr);
		
		if((hr>=9 && hr<=14)){
			System.out.println("I m in if.. timing is ok");
			chain.doFilter(request, response);
		}
		else {
			out.println("I m in else.. timing is not ok");
			res.sendRedirect("failure.jsp");
		}*/
		
		
		
		
	}

	

}
