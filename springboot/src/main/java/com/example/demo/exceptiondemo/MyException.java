package com.example.demo.exceptiondemo;

public class MyException extends RuntimeException {

    private String msg ;

    private String code ;

    public MyException(ExceptionEnum exceptionEnum) {
        this.msg = exceptionEnum.getMsg();
        this.code = exceptionEnum.getCode();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
