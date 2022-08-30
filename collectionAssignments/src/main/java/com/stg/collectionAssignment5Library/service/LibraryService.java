package com.stg.collectionAssignment5Library.service;

import java.util.List;

import com.stg.collectionAssignment5Library.exception.LibraryException;
import com.stg.collectionAssignment5Library.model.Book;

public interface LibraryService {
	
	public abstract String addNewBookInfo(List<Book> list,String bookName, String authurName, int accessionNum, float priceOfBook, boolean isIssued)throws LibraryException;
	public abstract List<Book> displayBooksInfo(List<Book> list);
	public abstract List<Book> displayBooksInfoOfAuthor(List<Book> list, String authorName)throws LibraryException;
	public abstract String displaySpecificBook(List<Book> list,int accessionNum) throws LibraryException;
	public abstract String totalBooksInLibrary(List<Book> list);
	

}
