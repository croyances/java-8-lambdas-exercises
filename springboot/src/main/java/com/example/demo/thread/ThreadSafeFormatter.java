package com.example.demo.thread;

import java.text.SimpleDateFormat;

public class ThreadSafeFormatter {

    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
    }; // java8的写法，装逼神器

    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocall =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
}


