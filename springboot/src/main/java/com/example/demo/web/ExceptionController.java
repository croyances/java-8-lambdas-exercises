package com.example.demo.web;


import com.example.demo.exceptiondemo.JsonResult;
import com.example.demo.exceptiondemo.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.exceptiondemo.ExceptionEnum.UNEXPECTED_EXCEPTION;

@RestController
@RequestMapping("/exception")

public class ExceptionController {

    private static final Logger logger =
            LoggerFactory.getLogger(ExceptionController.class);

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass) {
        logger.info("name：{}", name);
        logger.info("pass：{}", pass);
        return new JsonResult();
    }

    @GetMapping("/business")
    public JsonResult testException(String a) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            logger.error("ex :{}", UNEXPECTED_EXCEPTION.toString());
            throw new MyException(UNEXPECTED_EXCEPTION);
        }
        return new JsonResult();
    }


}
