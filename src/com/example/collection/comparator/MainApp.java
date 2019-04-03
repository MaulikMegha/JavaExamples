package com.example.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String args[]){

        List<Team> list = new ArrayList<>();

        list.add(new Team("Mark", 20));
        list.add(new Team("Adde", 18));
        list.add(new Team("Jos", 15));
        list.add(new Team("Mark", 17));

        System.out.println("** before shoring .....");
        list.stream().forEach(System.out::println);


        System.out.println("** after custom shoring .....");
        Collections.sort(list, new SortByNameNScore());
        list.stream().forEach(System.out::println);
    }
}