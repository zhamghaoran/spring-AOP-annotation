package java.com.zhr.spring.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.com.zhr.spring.dao.BookDao;
import java.com.zhr.spring.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void buyBook(Integer userid, Integer bookId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);

        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户的余额
        bookDao.updateBalance(userid,price);
    }
}
