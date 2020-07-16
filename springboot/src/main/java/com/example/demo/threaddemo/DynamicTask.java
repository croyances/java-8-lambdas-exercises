package com.example.demo.threaddemo;


import com.example.demo.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledFuture;

@Component
@Scope("prototype")
public class DynamicTask {


    private static Logger logger = LoggerFactory.getLogger(DynamicTask.class);


    private final ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture future;

    private String cron;

    public DynamicTask(ThreadPoolTaskScheduler threadPoolTaskScheduler) {
        this.threadPoolTaskScheduler = threadPoolTaskScheduler;
    }


    public void startCron() {
        cron = "0/1 * * * * ?";
        System.out.println(Thread.currentThread().getName());
        String name = Thread.currentThread().getName();
        future = threadPoolTaskScheduler.schedule(new myTask(name), new CronTrigger(cron));
        Config.map.put(name, future);
    }

    public void stop() {
        if (future != null) {
            future.cancel(true);
        }
    }

    private class myTask implements Runnable {
        private String name;

        myTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("test" + name);
        }
    }



}
