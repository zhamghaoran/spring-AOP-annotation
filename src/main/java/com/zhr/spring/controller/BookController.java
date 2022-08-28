package java.com.zhr.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.com.zhr.spring.service.BookService;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer userid,Integer bookId) {
        bookService.buyBook(userid,bookId);
    }
}
