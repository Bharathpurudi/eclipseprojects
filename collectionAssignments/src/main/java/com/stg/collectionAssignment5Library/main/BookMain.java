package com.stg.collectionAssignment5Library.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.stg.collectionAssignment5Library.exception.LibraryException;
import com.stg.collectionAssignment5Library.model.Book;
import com.stg.collectionAssignment5Library.service.*;

public class BookMain {

	public static void main(String[] args) throws LibraryException {
		Scanner input = new Scanner(System.in);
		Book book1 = new Book("Wings of Fire", "AbdulKalam", 1001, 150f, true);
		Book book2 = new Book("My Autobiography", "MahatmaGandhi", 1002, 200f, false);
		Book book3 = new Book("Half Girlfriend", "ChetanBagath", 1003, 180f, true);
		Book book4 = new Book("Two States", "ChetanBagath", 1004, 202f, false);
		Book book5 = new Book("The Secret of Nagas", "AmishTripati", 1005, 150f, true);
		Book book6 = new Book("The Voyages of Vayuputra", "AmishTripati", 1006, 175f, false);
		Book book7 = new Book("The Sci-fi World", "JackMist", 1007, 165f, true);
		Book book8 = new Book("Game of Thrones", "RobertD ", 1008, 160f, false);
		Book book9 = new Book("Harry Poter", "JKRowling", 1009, 300f, true);
		Book book10 = new Book("Amrutham Kurisina Raatri", "BalaGangadharTilak", 1010, 180f, false);
		List<Book> booksList = new ArrayList<Book>();
		Collections.addAll(booksList, book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
		//
		LibraryServiceImpl libraryServiceImpl = new LibraryServiceImpl();
		try {
			System.out.println(libraryServiceImpl.addNewBookInfo(booksList, "Java Tutorials", "JasonKarunakaranDaniel",
					1011, 200f, false));
			System.out.println(libraryServiceImpl.addNewBookInfo(booksList, "Java Tutorials", "JasonKarunakaranDaniel",
					1011, 200f, false));
		} catch (LibraryException libExe) {
			System.err.println(libExe.getMessage());
		}
		List<Book> booksListInLib = libraryServiceImpl.displayBooksInfo(booksList);
		System.out.println("Books in the Library are: ");
		System.out.println("Book Name" + " || " + "Author Name" + " || " + "Accession No" + " || " + "Book Price"
				+ " || " + "Is Issued");
		for (Book book : booksListInLib) {
			System.out.println(book.getBookName() + " || " + book.getAuthourName() + " || " + book.getAccessionNum()
					+ " || " + book.getPriceOfBook() + " || " + book.isIssued());
		}
		System.out.println("Enter the author name: ");
		String authorName = input.next();
		try {
			List<Book> authorBooks = libraryServiceImpl.displayBooksInfoOfAuthor(booksListInLib, authorName);
			for (Book book : authorBooks) {
				System.out.println("The books of " + book.getAuthourName() + " are " + book.getBookName());
			}
		} catch (LibraryException Lib) {
			System.err.println(Lib.getMessage());
		}
		System.out.println("Enter the accession number of book: ");
		int accessionNum = input.nextInt();
		try {
			System.out.println("The book name with " + accessionNum + " accession num is "
					+ libraryServiceImpl.displaySpecificBook(booksListInLib, accessionNum));
		} catch (LibraryException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(libraryServiceImpl.totalBooksInLibrary(booksListInLib));
		input.close();
	}

}
