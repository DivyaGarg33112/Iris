package com.examples;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class StringReverseTagHandler extends SimpleTagSupport{

	//This is representing the attribute of the tag
	private String input;
	
	public void setInput(String input){
		this.input=input;
	}
	
	
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		
		StringBuilder sb=new StringBuilder(input);
		
		out.println(sb.reverse());
		
	}
	
	
	
}
