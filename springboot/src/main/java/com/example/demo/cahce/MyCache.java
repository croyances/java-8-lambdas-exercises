package com.example.demo.cahce;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@Component

public class MyCache {

    private  ConcurrentHashMap<String, List<String>> map = new ConcurrentHashMap<>(1024);

    @org.springframework.context.event.EventListener
    private void  test (String  s){
        System.out.println("加载缓存");
        map.put("ss",new ArrayList<>(Arrays.asList("12","ASD","SADAS")));

    }


    public ConcurrentHashMap<String, List<String>> getMap() {

        return map;
    }

    public void setMap(ConcurrentHashMap<String, List<String>> map) {
        this.map = map;
    }
}
