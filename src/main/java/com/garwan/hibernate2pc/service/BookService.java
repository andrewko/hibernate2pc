package com.garwan.hibernate2pc.service;

import java.util.List;

import com.garwan.hibernate2pc.domain.Book;

public interface BookService {
	
	Book createBook(String name);

	List<Book> loadAllBooks();
}
