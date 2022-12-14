package com.example.model;

public class Book {
	private int id;
	private String title;
	private String author;
	private int price;
	private String genre;
	
	public Book(int id, String title, String author, int price, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.genre = genre;
	}
	public Book() {
		super();
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", genre=" + genre + "]";
	}

}
