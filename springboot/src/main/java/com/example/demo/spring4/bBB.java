package com.example.demo.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/10 13:59
 */
@Component
public class bBB {

    @Qualifier("say")
    @Autowired
    private Say say01;

    public Say getSay() {
        return say01;
    }

    public void setSay(Say say) {
        this.say01 = say;
    }
}
