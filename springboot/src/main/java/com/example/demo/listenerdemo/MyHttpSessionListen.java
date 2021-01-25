package com.example.demo.listenerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * @author admin
 */

@Component
public class MyHttpSessionListen implements HttpSessionListener {

    public static Integer count = 0;

    private static Logger logger = LoggerFactory.getLogger(MyHttpSessionListen.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        logger.info("上线了,人数为" + count);
        ServletContext servletContext = se.getSession().getServletContext();
        servletContext.setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        logger.info("下线了,人数为" + count);
        ServletContext servletContext = se.getSession().getServletContext();
        servletContext.setAttribute("count", count);
    }
}
