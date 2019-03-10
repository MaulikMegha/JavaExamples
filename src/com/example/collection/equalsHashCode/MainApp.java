package com.example.collection.equalsHashCode;

import java.util.HashSet;
import java.util.Set;

public class MainApp {
    public static void main(String args[]){
        Set<Car> set = new HashSet<>();

        System.out.println("set Size before add to set - "+set.size());
        set.add(new Car(752456, "Honda", "white", 2015));
        set.add(new Car(752456, "Honda", "white", 2015));
        set.add(new Car(123458, "Nissan", "black", 2012));
        set.add(new Car(985630, "Toyota", "red", 2008));
        System.out.println("set Size after added to set - "+set.size());
        System.out.println("--------------------------");

        set.stream().forEach(System.out::println);
    }

}