package com.example.demo.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: croyances
 * @Date: 2020/7/12 11:44
 * @version: 1.0
 */

@Aspect
public class MyUserAspect {


    @Before(value = "MyUserAspect.pointCut()" )
    private void checkPri(){
        System.out.println("权限校验");
    }

    @Pointcut("execution(* com.example.demo.aopdemo.UserImpl.save(..))" )
    private void pointCut(){

    }
}
