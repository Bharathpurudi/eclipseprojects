package com.stg.collectionAssignment5Library.exception;


public class LibraryException extends Exception {
	
	private String message;

	public LibraryException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}
