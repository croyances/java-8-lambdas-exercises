package com.insightfullogic.java8.AnnotationDemo;

public class demoTest {


    public static void main(String[] args) {
        ss s = new ss();
        System.out.println(s.s);
    }

    static class ss {

        @demo(value = "as")
        String s;

    }
}
