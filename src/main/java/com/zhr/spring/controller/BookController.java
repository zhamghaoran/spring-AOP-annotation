package com.zhr.spring.controller;


import com.zhr.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void buyBook(Integer userid,Integer bookId) {
        bookService.buyBook(userid,bookId);
    }
}
