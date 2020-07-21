package com.example.demo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);
// 创建多个有返回值的任务
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 10; i++) {
            Callable c = new MyCall();
            FutureTask a = new FutureTask(c);

            Thread thread = new Thread(a);
            thread.start();
            try {
                System.out.println(a.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
// 执行任务并获取 Future 对象
            //    Future f = pool.submit(c);
            //    list.add(/f);
        }
// 关闭线程池
        pool.shutdown();
// 获取所有并发任务的运行结果
        for (Future f : list) {
// 从 Future 对象上获取任务的返回值，并输出到控制台
            System.out.println("res：" + f.get().toString());
        }
    }


}
