package com.zhr.spring.controller;


import com.zhr.spring.service.BookService;
import com.zhr.spring.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private final BookService bookService;
    @Autowired
    private CheckOutService checkOutService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void buyBook(Integer userid,Integer bookId) {
        bookService.buyBook(userid,bookId);
    }
    public void checkout(Integer userid,Integer[] bookids) {
        checkOutService.check(userid,bookids);
    }
}
