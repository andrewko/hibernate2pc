package com.garwan.hibernate2pc.service;

import java.util.List;

import com.garwan.hibernate2pc.domain.Author;

public interface AuthorService {

	Author createAuthor(String name);
	
	List<Author> loadAllAuthors();

}
