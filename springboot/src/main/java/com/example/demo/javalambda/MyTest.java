package com.example.demo.javalambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/8/17 15:12
 */
public class MyTest {

   static class Transaction{
        private final Trader trader;
        private final int year;
        private final int value;
        public Transaction(Trader trader, int year, int value){
            this.trader = trader;
            this.year = year;
            this.value = value;
        }
        public Trader getTrader(){
            return this.trader;
        }
        public int getYear(){
            return this.year;
        }
        public int getValue(){
            return this.value;
        }
        public String toString(){
            return "{" + this.trader + ", " +
                    "year: "+this.year+", " +
                    "value:" + this.value +"}";
        }
    }


    static class Trader{
        private final String name;
        private final String city;
        public Trader(String n, String c){
            this.name = n;
            this.city = c;
        }
        public String getName(){
            return this.name;
        }
        public String getCity(){
            return this.city;
        }

        public String toString(){
            return "Trader:"+this.name + " in " + this.city;
        }
    }

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> collect = transactions.stream().filter(s -> s.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        List<String> collect1 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(s -> s.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());

        List<String> collect2 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());

        boolean milan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(s -> s.getCity().equals("Milan"));

         transactions.stream()
                .filter(s -> s.getTrader().getCity().equals("Cambridge"))
                .mapToInt(s -> s.getValue())


                ;

        Integer reduce = transactions.stream()
                .map(s -> s.getValue())
                .reduce(Integer::max)
                .get();

        List<Transaction> limit = transactions.stream()
                .sorted(Comparator.comparing(Transaction::getYear))
                .limit(0)
                .collect(Collectors.toList());

        System.out.println(1);


        IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b ->  Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                ).limit(5)
                .forEach(s-> System.out.println(s[0]+","+s[1]+","+s[2]));



        IntStream.rangeClosed(0, 9)
                .boxed()
                .flatMap(a-> IntStream.rangeClosed(0, 9).boxed().flatMap(b->IntStream.rangeClosed(0, 9).boxed()
                        .filter(c->a*a*a + b*b*b +c*c*c==a+b*10+c*100&&(a+b*10+c*100>100||a+b*10+c*100>1000))
                        .map(c->new int[]{a,b,c})
                )).forEach(s-> System.out.println(String.valueOf(s[0]+s[1]*10+s[2]*100)));
        //  .forEach(ints -> System.out.println(ints[0]+ints[1]+ints[2]));


        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();

        String[] strings = {"2", "3", "5", "7","11", "13"};


        IntStream.generate(() ->
        {
            return 0;
        }).mapToObj((s) -> {
            return s;
        }).forEach(System.out::println);




    }
}
