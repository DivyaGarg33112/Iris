package com.springs.controllers;

public class SpringException extends RuntimeException{
	
	private String errorMsg;
	
	public SpringException(String errorMsg){
		super(errorMsg);
	}
	
	
	
}
