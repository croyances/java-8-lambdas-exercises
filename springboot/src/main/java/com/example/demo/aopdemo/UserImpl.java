package com.example.demo.aopdemo;

/**
 * @Author: croyances
 * @Date: 2020/7/12 11:43
 * @version: 1.0
 */
public class UserImpl implements User {

    @Override
    public void save() {
        System.out.println("save   ...");
    }

    @Override
    public void say() {
        System.out.println("say   ...");
    }
}
