package com.app.service.book;

import java.util.List;

import com.app.dto.book.Book;

public interface BookService {

	List<Book> findBookList();
	
	int saveBook(Book book);

	int modifyBook(Book book);

	int removeBook(String id); 	
}
