package com.restapi.demo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demo.model.Book;
import com.restapi.demo.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookService;
	
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@GetMapping("/findAll")
	public HashSet<Book> getAllBooks(){
		return bookService.findAllBooks();
	}
	
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
		bookService.deleteAllBooks();
	}
	
	@GetMapping("/findByName/{Name}")
	public Book getBookByName(String Name) {
		return bookService.findBookByName(Name);
	}
}
