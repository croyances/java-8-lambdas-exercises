package com.example.demo.thread;


public class RunOrStart {

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }, "Thread-A").start();

        new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " " + j);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }, "Thread-B").run();
    }

}
