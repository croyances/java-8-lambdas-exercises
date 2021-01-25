package com.insightfullogic.java8.answers.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Fibonacci {

    private final Map<Integer, Long> cache;

    public Fibonacci() {
        cache = new HashMap<>();
        cache.put(0, 0L);
        cache.put(1, 1L);
    }

    public long fibonacci(int x) {
        return cache.computeIfAbsent(x, n -> fibonacci(n - 1) + fibonacci(n - 2));
    }


    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(6));


        String ss = "sdhflkdslgjldgsdfjlsdhglaASDGDFGHDSFG";
        //  char[] chars = ss.toCharArray();
//        Map<String, Long> collect = Stream.of(ss).collect(
//                groupingBy(ss.toCharArray()->c , counting())
//        );
//        System.out.println(collect);


        Stream<Character> stream = Stream.of(
                ss.charAt(0), ss.charAt(1)
        );
        Stream<Character> a = Stream.of('a', 'g', 'a', 'A', 'Q', 'a');
        Map<Character, Long> collect1 = a.collect(groupingBy(Character -> Character, counting()));
        Map<Character, Long> collect6 = a.collect(groupingBy(
                Character -> Character,
                counting()));
        System.out.println(collect1.toString());

        List<String> strings = new ArrayList<>();
        strings.add(ss);
        Map<String, Integer> collect = strings.parallelStream().collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
        System.out.println(collect.toString());


    }

}
