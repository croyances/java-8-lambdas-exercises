package com.example.demo.threaddemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    private String string;

    private String getString() {
        return string;
    }

    private void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args) throws InterruptedException {
        int threads = 9;
        CountDownLatchDemo demo = new CountDownLatchDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //     CountDownLatch countDownLatch = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            executorService.execute(() -> {
                demo.setString(Thread.currentThread().getName());
                System.out.println(demo.getString());
                //            countDownLatch.countDown();
            });

        }
        //    countDownLatch.await();
        System.out.println(1231);


    }

}
