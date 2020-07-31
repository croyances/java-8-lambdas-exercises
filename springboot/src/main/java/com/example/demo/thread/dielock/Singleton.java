package com.example.demo.thread.dielock;

/**
 * @Author: croyances
 * @Date: 2020/7/23 21:52
 * @version: 1.0
 */
public class Singleton {

    private static  Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingle() {
        System.out.println(singleton);
        return singleton;
    }
}
