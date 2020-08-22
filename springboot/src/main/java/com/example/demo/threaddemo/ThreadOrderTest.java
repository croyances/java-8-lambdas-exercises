package com.example.demo.threaddemo;

import java.util.concurrent.CountDownLatch;

public class ThreadOrderTest {

    public static void main(String[] args) {
        /**
         * 创建线程类的时候，将上一个计数器和本线程计数器传入。运行前业务执行上一个计数器.await, 执行后本计数器.countDown。
         */

        CountDownLatch num0 = new CountDownLatch(0);// 在这里count为0，表示该线程立马复位执行
        CountDownLatch num1 = new CountDownLatch(1);// 在这里count为0，表示该线程立马复位执行
        CountDownLatch num2 = new CountDownLatch(1);// 在这里count为0，表示该线程立马复位执行
        Thread t1 = new Thread(new Count(num0, num1));
        Thread t2 = new Thread(new Count(num1, num2));
        Thread t3 = new Thread(new Count(num2, num2));

        t1.start();
        t2.start();
        t3.start();


    }

    static class Count implements Runnable {

        CountDownLatch num1;
        CountDownLatch num2;

        /**
         * 该构造器传递了上一个线程的计数器和当前线程的计数器
         *
         * @param num0
         * @param num1
         */
        public Count(CountDownLatch num1, CountDownLatch num2) {
            super();
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() {
            try {
                // 等待线程1执行完毕线程2开始执行，因为线程1开始立马就会执行(count=0)
                num1.await();
                System.out.println("开始执行线程:" + Thread.currentThread().getName());
                num2.countDown();// 本线程计数器减少
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
