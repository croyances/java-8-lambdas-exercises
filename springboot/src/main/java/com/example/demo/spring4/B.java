package com.example.demo.spring4;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/9 11:06
 */
@Order(86)
//@Component
public class B implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(args);
        System.out.println(86);
    }
}

