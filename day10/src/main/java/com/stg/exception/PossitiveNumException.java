package com.stg.exception;

public class PossitiveNumException extends Exception {
	
	private String message;

	public PossitiveNumException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	

}
