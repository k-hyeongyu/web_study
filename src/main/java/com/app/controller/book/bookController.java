package com.app.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.book.Book;
import com.app.service.book.BookService;

@Controller
public class bookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/book/bookList")
	public String bookList(Model model) {
		List<Book> books = bookService.findBookList();
	    model.addAttribute("books", books);
		return "book/bookList";
	}
	
	@GetMapping("/book/bookInfo")
	public String bookdetail() {
		
		return "book/bookInfo";
	}

	@GetMapping("/book/bookAdd")
	public String bookAdd() {
		
	    return "book/bookAdd";
	}
	
	@PostMapping("/book/bookAdd")
	public String bookAdd(Book book) {
		bookService.saveBook(book);
	    return "redirect:/book/bookList";
	}
}
