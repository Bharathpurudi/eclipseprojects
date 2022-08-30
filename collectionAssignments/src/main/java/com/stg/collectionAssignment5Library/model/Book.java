package com.stg.collectionAssignment5Library.model;

public class Book implements Comparable<Book> {
	private String bookName;
	private String authourName;
	private int accessionNum;
	private float priceOfBook;
	private boolean isIssued;
	public Book() {
		super();
	}
	public Book(String bookName, String authourName, int accessionNum, float priceOfBook, boolean isIssued) {
		super();
		this.bookName = bookName;
		this.authourName = authourName;
		this.accessionNum = accessionNum;
		this.priceOfBook = priceOfBook;
		this.isIssued = isIssued;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthourName() {
		return authourName;
	}
	public void setAuthourName(String authourName) {
		this.authourName = authourName;
	}
	public int getAccessionNum() {
		return accessionNum;
	}
	public void setAccessionNum(int accessionNum) {
		this.accessionNum = accessionNum;
	}
	public float getPriceOfBook() {
		return priceOfBook;
	}
	public void setPriceOfBook(float priceOfBook) {
		this.priceOfBook = priceOfBook;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}


	@Override
	public int compareTo(Book anotherBook) {
		
		if(this.priceOfBook==anotherBook.priceOfBook) {
			return 0;
		}else if(this.priceOfBook<anotherBook.priceOfBook){
			return -1;
		}else {
			return 1;
		}
	}
	
	

}
