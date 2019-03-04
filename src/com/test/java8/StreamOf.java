package com.test.java8;

import java.util.Arrays;

public class StreamOf {
    public static void main(String args[]) {
        String input[] = {"Maulik", "Bhavin", "Kamini", "Rucha", "Kokilaben", "Mangalbhai"};

        //find sorted first name
        Arrays.stream(input)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        // output is Bhavin


        System.out.println("");


        // print all name start with 'K'
        Arrays.stream(input)
                .filter(x -> x.startsWith("K"))
                .forEach(System.out::println);
        // output is Kamini, Kokilaben

    }
}