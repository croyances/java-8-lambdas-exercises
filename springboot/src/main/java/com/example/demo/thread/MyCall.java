package com.example.demo.thread;

import java.util.concurrent.Callable;

public class MyCall implements Callable<String> {




    @Override
    public String call() throws Exception {
        return "1";
    }

}
