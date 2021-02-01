package com.example.demo.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/8 14:00
 */
//@Component
public class Test implements ApplicationRunner {


    @Autowired
    private Say say;


    @Autowired
    private Say say02;

    @Autowired
    private Say tell;

    @Autowired
    @Qualifier("say0000001")
    private Say say010;

    @Autowired
    private User user;

    @Resource
    private User user01;

    @Autowired
    ApplicationContext context;

    @Autowired
    private aAA aAA;

    @Autowired
    private bBB bBB;
//    public static void main(String[] args) {
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Say beanFactorys=applicationContext.getBean(Say.class);
//        beanFactorys.say();
//
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        String applicationName = context.getId();
//        System.out.println(applicationName);
//        say010.say();
//        say.say();
//        say02.say();

        System.out.println(user.getName());
        System.out.println(user01.getName());
        System.out.println(user01.equals(user));
        System.out.println(say.equals(say010));


        System.out.println(aAA.getSay().equals(bBB.getSay()));


    }
}
