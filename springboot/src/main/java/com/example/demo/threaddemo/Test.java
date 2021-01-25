package com.example.demo.threaddemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: croyances
 * @Date: 2020/7/31 22:11
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        final Demo d = new Demo();
        new Thread() {
            @Override
            public void run() {
                d.getGoneWork("2020-07-31 24:00:00");
            }

            ;
        }.start();
    }

}

class Demo {
    ReentrantLock rl = new ReentrantLock();

    public void getGoneWork(String s) {
        rl.lock();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date endDate = null;
        try {
            // 设置下班时间。。。
            endDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 获取下班时间
        long endMillis = endDate.getTime();

        while (true) {
            // 创建此时此刻的时间对象
            Date nowDate = new Date();
            // 获取此时此刻的时间
            long nowMillis = nowDate.getTime();

            if (endMillis > nowMillis) {
                try {
                    Thread.sleep(1000);// 进程睡眠1s；
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long h = ((endMillis - nowMillis) / 1000 / 3600);
                System.out.println("距离下班还有:" + (h) + "时" + ((endMillis - h * 3600 * 1000 - nowMillis) / 1000) / 60 + "分: "
                        + ((endMillis - nowMillis) / 1000) % 60 + "秒");
            } else {
                System.out.println("下班了! ! ! ");
                break;
            }
        }
        rl.unlock();
    }
}
