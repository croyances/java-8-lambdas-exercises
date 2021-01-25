package com.example.demo.spring4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/8 13:59
 */

//@ComponentScan("spring4")
//@Component
@Configuration
public class JavaConfig {


    @Bean

//    public Say say(){
//        return new SayImpl(user());
//    }
    public Say say(User user01) {
        return new SayImpl(user01);
    }

    @Bean
    @Qualifier("say0000001")
    public Say say001() {
        return new SayImpl(user01());
    }

    @Bean

    public Say tell() {
        return new TellImpl();
    }

    @Bean

    public Say say02(User user01) {
        return new SayImpl(user01);
    }


    public User user01() {
        return new User("say(01)");
    }

    @Bean
    public User user() {
        System.out.println(user01());
        return new User("say()");
    }


}
