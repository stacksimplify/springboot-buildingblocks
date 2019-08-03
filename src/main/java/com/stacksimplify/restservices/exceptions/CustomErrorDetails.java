package com.stacksimplify.restservices.exceptions;

import java.util.Date;

//Simple custom error details bean
public class CustomErrorDetails {
	
	private Date timestamp;
	private String message;
	private String errordetails;
	
	//Fields Constructor
	public CustomErrorDetails(Date timestamp, String message, String errordetails) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.errordetails = errordetails;
	}
	
	//GETTERS
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getErrordetails() {
		return errordetails;
	}
	
	

}
