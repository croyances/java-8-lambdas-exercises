package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/10 11:50
 */
@Component
public class AsyncService {

    public void async1() {
        System.out.println("1:" + Thread.currentThread().getName());
        this.async2();
    }

    @Async
    public void async2() {
        System.out.println("2:" + Thread.currentThread().getName());
    }
}
