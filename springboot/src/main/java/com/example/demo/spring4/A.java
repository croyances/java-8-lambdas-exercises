package com.example.demo.spring4;

import com.example.demo.aopdemo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/9 11:05
 */
@Order(81)
//@Component
public class A implements CommandLineRunner {

    @Autowired
    private User user;


    @Override
    public void run(String... args) throws Exception {
        int length = args.length;
        System.out.println(1);
        user.save();
    }
}
