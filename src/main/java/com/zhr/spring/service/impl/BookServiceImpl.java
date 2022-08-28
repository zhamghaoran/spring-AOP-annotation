package com.zhr.spring.service.impl;


import com.zhr.spring.service.BookService;
import org.springframework.stereotype.Service;

import com.zhr.spring.dao.BookDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * 声明式事务的配置步骤
 * 在spring的配置文件中配置事务管理器
 * 开启事务的注解功能
 * 在需要被事务管理的方法上面添加@Transactional注解，该方法就会被事务管理
 * {@code @Transactional标识的位置：方法上，类上（类中所有的方法都会被事务管理）}
 */

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
//    @Transactional(
//            //readOnly = true // 设置事务为只读
//            //timeout = 3 设置时间，超过时间强制回滚
//            //默认遇到异常就回滚
//            //noRollbackFor = ArithmeticException.class
//            //noRollbackForClassName = "java.lang.ArithmeticException"
//            //isolation = Isolation.DEFAULT  // 可重读读
//            propagation = Propagation.REQUIRES_NEW  // 事务的传播行为（使用被调用者的事务）
//    )

    public void buyBook(Integer userid, Integer bookId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户的余额
        bookDao.updateBalance(userid, price);
//        System.out.println(1/0);
    }
}
