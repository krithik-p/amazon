package com.example.model;

import java.util.List;

public class Books {
	List<Book> books;

	public Books() {
		super();
		
	}
	
	public Books(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
