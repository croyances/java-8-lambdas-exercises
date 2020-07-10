package com.example.demo.handlerInterceptordemo;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class MyInterceptor  implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        UnHandler annotation = method.getAnnotation(UnHandler.class);
        if (annotation!=null){
            return true;
        }


        System.out.println("====拦截到了方法：{}，在该方法执行之前执行====");

        return true;

    }
}
