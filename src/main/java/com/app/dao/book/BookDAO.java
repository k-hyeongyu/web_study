package com.app.dao.book;

import java.util.List;

import com.app.dto.book.Book;

public interface BookDAO {

	List<Book> findBookList();           // 전체 책 목록 조회
	
	int saveBook(Book book);             // 새로운 도서정보 저장
	
	int removeBook(String id);          // 도서정보 삭제
	
	int modifyBook(Book book); 			 // 도서정보 수정

	void insertBook(Book book);
}