package com.zhr.spring.service.impl;

import com.zhr.spring.service.BookService;
import com.zhr.spring.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;

@Service
public class CheckOutServiceImpl implements CheckOutService {
    @Autowired
    private BookService bookService;
    @Override
//    @Transactional
    public void check(Integer userid, Integer[] bookids) {
        for (Integer bookid : bookids) {
            bookService.buyBook(userid,bookid);
        }
    }
}
