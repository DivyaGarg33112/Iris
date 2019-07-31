package com.examples;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/*This is a class where i will write what my tag will do . This class is known 
 * as TagHandler class . As per JSP specification , Tag handler class should be
 * the child of javax.servlet.jsp.tagext.SimpleTagSupport class . In our Tag handler
 * class we will override the doTag() method , where we will write what my tag 
 * will do*/
public class DateTagHandler extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		LocalDateTime ldt=LocalDateTime.now();
		
		/*getJspContext() is the method of our parent class so can be invoked
		 * directly . This method will return the object of JspContext class.*/
		JspContext context=getJspContext();
		
		//JspContext class has a method getOut() which will return the object of
		//JspWriter..
		JspWriter out=context.getOut();
		out.println(ldt);
	}
	
	
	
}
