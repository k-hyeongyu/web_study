package com.app.dao.book.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.book.BookDAO;
import com.app.dto.book.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Book> findBookList() {

		System.out.println("[DAO] 호출 findBookList");

		// DB에서 room 데이터 조회 -> List
		List<Book> booksList = sqlSessionTemplate.selectList("book_mapper.findBookList");

		return booksList;
	}
	
	@Override
	public int saveBook(Book book) {

		// book 매개변수 값 -> DB에 저장

		// 내가 실행할 쿼리가 위치한 식별자
		// namespace.id
		int result = sqlSessionTemplate.insert("book_mapper.saveBook", book);
		// insert 적용된 행의 숫자가 return됨

		return result;
	}
	
	@Override
	public int removeBook(String id) {

		int result = sqlSessionTemplate.delete("book_mapper.removeBook", id);
		//delete 적용된 행의 수 
		
		return result;
	}
	
	@Override
	public int modifyBook(Book book) {

		int result = sqlSessionTemplate.update("book_mapper.modifyBook", book);
		
		return result;
	}
	
	@Override
	public void insertBook(Book book) {
		
		sqlSessionTemplate.insert("book_Mapper.insertBook", book);
    }
}
