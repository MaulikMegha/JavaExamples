package com.example.java8;

import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String args[]){

        // print 1 to 9
        IntStream
                .range(1,10)
                .forEach(System.out::println);

        System.out.println("");

        // use of skip and sum - result is 7
        int sum = IntStream
                .range(1,5)
                .skip(2)
                .sum();
        System.out.println(sum);

        System.out.println("");


    }

}