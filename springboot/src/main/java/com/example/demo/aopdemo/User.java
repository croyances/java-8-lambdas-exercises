package com.example.demo.aopdemo;

/**
 * @Author: croyances
 * @Date: 2020/7/12 11:42
 * @version: 1.0
 */

public interface User {


    // @Pointcut("execution(* com.example.demo.aopdemo.UserImpl.save(..))" )
    void save();

    void say();
}
