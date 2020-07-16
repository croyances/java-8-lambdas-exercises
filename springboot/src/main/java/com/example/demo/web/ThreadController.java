package com.example.demo.web;


import com.example.demo.config.Config;
import com.example.demo.threaddemo.DynamicTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ScheduledFuture;

@RestController
public class ThreadController {


    @Autowired
    private DynamicTask task;
    @RequestMapping("/task")
    public void test() throws Exception {
        // 开启定时任务，对象注解Scope是多利的。
        task.startCron();

    }
    @RequestMapping("/stop")
    public void stop() throws Exception {
        // 提前测试用来测试线程1进行对比是否关闭。
        ScheduledFuture scheduledFuture = Config.map.get("http-nio-8080-exec-1");
        scheduledFuture.cancel(true);
        // 查看任务是否在正常执行之前结束,正常true
        boolean cancelled = scheduledFuture.isCancelled();
        while (!cancelled) {
            scheduledFuture.cancel(true);
        }
    }

}
