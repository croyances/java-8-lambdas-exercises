package com.example.demo.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskTest {

    //指令重排
    static private volatile int num = 0;
    //  static  private  int num = 0;

    public static void main(String[] args) {
        TimerTask timeTask = new TimerTask() {
            public void run() {
                num = 1;
                System.out.println("ok");
            }
        };

        long l = 5000;
        Timer timer = new Timer();
        timer.schedule(timeTask, 5000, 10);

        Runnable runnable = () -> {
            System.out.println(new Date());
            int a;
            while (num == 0) {
                a = 1 + 1;
            }
            System.out.println(new Date());

        };

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
