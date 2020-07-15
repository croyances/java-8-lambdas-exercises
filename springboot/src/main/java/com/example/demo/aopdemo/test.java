package com.example.demo.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: croyances
 * @Date: 2020/7/12 11:53
 * @version: 1.0
 */
public class test {

    public static void main(String[] args) {


        ApplicationContext a =  new ClassPathXmlApplicationContext("app.xml");
        User user =(User) a.getBean("User");
        user.save();
    }
}
