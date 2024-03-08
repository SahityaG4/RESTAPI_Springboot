package com.restapi.demo.service;

import java.util.HashSet;

import com.restapi.demo.model.Book;

public interface BookService {
	public HashSet<Book> findAllBooks();
	public void addBook(Book book);
	public void deleteAllBooks();
	public Book findBookByName(String Name);
}
