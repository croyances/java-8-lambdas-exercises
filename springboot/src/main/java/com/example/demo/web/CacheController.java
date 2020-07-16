package com.example.demo.web;


import com.example.demo.cahce.MyCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController

public class CacheController {

    @Autowired
    private MyCache myCache;

    @GetMapping("/cache")
    public String test(){
        return myCache.getMap().toString();
    }
}
