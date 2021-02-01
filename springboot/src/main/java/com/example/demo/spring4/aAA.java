package com.example.demo.spring4;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/10 13:59
 */
//@Component
public class aAA {

    @Autowired
    private Say say;


    public Say getSay() {
        return say;
    }

    public void setSay(Say say) {
        this.say = say;
    }
}
