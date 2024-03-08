package com.restapi.demo.model;

public class Book {
	String Name;
	String Author;
	String Genre;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public Book(String name, String author, String genre) {
		super();
		Name = name;
		Author = author;
		Genre = genre;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
