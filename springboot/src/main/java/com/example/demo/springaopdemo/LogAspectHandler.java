package com.example.demo.springaopdemo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectHandler {

//
//    @Pointcut("execution( * com.example.demo.web..*.*(..)))")
//    public void pointCut(){
//
//    }
//
//
//    @Before("pointCut()")
//    public void say(JoinPoint joinPoint){
//        Object target = joinPoint.getTarget();
//        joinPoint.getArgs();
//
//        System.out.println(12);
//    }
}
