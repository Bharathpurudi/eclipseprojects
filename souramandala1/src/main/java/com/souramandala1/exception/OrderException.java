package com.souramandala1.exception;

public class OrderException extends Exception{


	private static final long serialVersionUID = 1L;
	private String message;
	
	
	public OrderException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
	

}
