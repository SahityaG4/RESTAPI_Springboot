package com.restapi.demo.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.restapi.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	HashSet<Book> books = new HashSet<>();

	@Override
	public HashSet<Book> findAllBooks() {
		// TODO Auto-generated method stub
		if(!books.isEmpty()) {
			return books;
		}
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	@Override
	public void deleteAllBooks() {
		// TODO Auto-generated method stub
		books.clear();
	}

	@Override
	public Book findBookByName(String Name) {
		// TODO Auto-generated method stub
		Book book = books.stream().filter((b) -> b.getName().equals(Name)).findAny().orElse(null);
		return book;
	}

}
