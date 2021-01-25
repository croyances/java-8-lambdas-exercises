package com.example.demo.thread;

public class TestThreadLocalNpe {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal();

    public static void set() {
        threadLocal.set(1L);
    }

    public static long get() {
        return threadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            set();
            System.out.println(get());
        })
                .start();
        // 目的就是为了让子线程先运行完
        Thread.sleep(100);
        System.out.println(get());
    }
}


