package com.zhr.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.PipedReader;

public interface CheckOutService {
    void check(Integer userid, Integer[] bookids);
}
