package com.zhr.spring;


import com.zhr.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基于xml的声明式事务的，必须引入aspect的依赖
 * <dependency>
 *    <groupId>org.springframework</groupId>
 *    <artifactId>spring-aspects</artifactId>
 * </dependency>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class Txxml {
    @Autowired
    private BookController bookController;
    @Test
    public void testByBook() {
        //bookController.buyBook(1,1);
        bookController.checkout(1,new Integer[]{1,2});
    }

}
