
package com.stg.collectionAssignment5Library.service;

import java.util.ArrayList;
import java.util.List;

import com.stg.collectionAssignment5Library.exception.LibraryException;
import com.stg.collectionAssignment5Library.model.Book;

public class LibraryServiceImpl implements LibraryService  {

	@Override
	public String addNewBookInfo(List<Book> list, String bookName, String authurName, int accessionNum,
			float priceOfBook, boolean isIssued) throws LibraryException {
		String temp=null;
		Book newBook = new Book(bookName, authurName, accessionNum, priceOfBook, isIssued);
		if(list.contains(newBook)) {
			throw new LibraryException("Book is already in the Library");
		}else {
			list.add(newBook);
			temp = "Book Added Successfully";
		}
		return temp;
	}

	@Override
	public List<Book> displayBooksInfo(List<Book> list) {
		return list;
	}
	
	@Override
	public List<Book> displayBooksInfoOfAuthor(List<Book> list, String authorName) throws LibraryException {
		List<Book> tempList = new ArrayList<Book>();
		for (Book book : list) {
			if(book.getAuthourName().equalsIgnoreCase(authorName)) {
				tempList.add(book);
			}else if(tempList.size()==0) {
				throw new LibraryException("No books found for this author");
			}
		}
		return tempList;
	}

	@Override
	public String totalBooksInLibrary(List<Book> list) {
		int totalBooks = list.size();
		return "Total Num of Books in Library are "+totalBooks;
	}

	@Override
	public String displaySpecificBook(List<Book> list, int accessionNum)throws LibraryException {
		String temp = null;
		for (Book book : list) {
			if(book.getAccessionNum()==accessionNum) {
				temp= book.getBookName();
				}else{
					throw new LibraryException("No book with that accession number");
				}
		}
		return temp;
	}

	
	

}
