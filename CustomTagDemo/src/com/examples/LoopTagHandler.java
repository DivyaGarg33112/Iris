package com.examples;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LoopTagHandler extends SimpleTagSupport {

	//start and end represents the tag attributes
	private int start;
	private int end;
	
	public void setStart(int start) {
		this.start = start;
	}


	public void setEnd(int end) {
		this.end = end;
	}

	StringWriter sw=new StringWriter();

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		getJspBody().invoke(sw);
		
		for(int i=start;i<=end;i++){
			out.println(sw);
		}
	}
	
	
	
}
