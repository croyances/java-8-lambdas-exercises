package com.insightfullogic.java8.springAopDemo;


import lombok.Data;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Data
public class springAopDemo {

    @Pointcut
    public void s() {

    }
}
