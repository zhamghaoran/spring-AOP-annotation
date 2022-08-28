package java.com.zhr.spring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.com.zhr.spring.controller.BookController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTset {
    @Autowired
    private BookController bookController;
    @Test
    public void testByBook() {
        bookController.buyBook(1,1);
    }
}
