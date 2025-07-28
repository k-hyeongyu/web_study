package com.app.service.book.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.book.BookDAO;
import com.app.dto.book.Book;
import com.app.service.book.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> findBookList() {
		
		System.out.println("[Service] 호출 findBookList");
		
		//서비스 로직 ... 
		// ...
		// DAO 를 활용해서, 실제 데이터 가져오기
		List<Book> bookList = bookDAO.findBookList();

		return bookList;
	}
	
	@Override
	public int saveBook(Book book) {
		
		//room 정보 저장해라~ -> DAO
		int result = bookDAO.saveBook(book);
		
		return result;
	}
	
	@Override
	public int removeBook(String id) {
		
		int result = bookDAO.removeBook(id);
		
		return result;
	}

	@Override
	public int modifyBook(Book book) {
		
		int result = bookDAO.modifyBook(book);
		
		return result;
	}
}
