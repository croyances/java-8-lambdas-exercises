package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/10 11:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class BaseTest {

    @Autowired
    AsyncService asyncService;

    @Test
    public void testAsync() {
        asyncService.async1();
        asyncService.async2();
    }

}
