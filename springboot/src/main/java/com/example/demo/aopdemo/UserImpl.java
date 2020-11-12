package com.example.demo.aopdemo;

/**
 * @Author: croyances
 * @Date: 2020/7/12 11:43
 * @version: 1.0
 */
public class UserImpl implements User {

    private String name;

    public UserImpl(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("save   ..."+name);
    }

    @Override
    public void say() {
        System.out.println("say   ...");
    }
}
