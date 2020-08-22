package com.example.demo.javalambda;

import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/8/19 10:08
 */
public class CharCounting {
    public static void main(String[] args) {
        String s= "A124984ADG6546FDGWET1213";
        Map<Character, Long> collect = IntStream.range(0, s.length())
                .mapToObj(s::charAt)
                .collect(groupingBy(Character::charValue, counting()))



                ;
        System.out.println(collect);
        IntStream.range(0,5).forEach(System.out::print); //0 1 2 3 4
        System.out.println("--------------------");
        IntStream.rangeClosed(0,5).forEach(System.out::print); //0 1 2 3 4 5
        System.out.println("--------------------");
        //024681012141618
        Stream.iterate(0, a -> a + 2).limit(10).forEach(System.out::print);




    }

}
