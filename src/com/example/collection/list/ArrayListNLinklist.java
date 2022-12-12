package com.example.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListNLinklist {
    public static void main(String args[]){
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Ram");
        myList.add("Shita");
        myList.add("Lhaxman");
        myList.add("Hanuman");
        myList.add("Ram");

        Iterator<String> result = myList.iterator();
        while(result.hasNext()) {
            System.out.println(result.next());
        }

        System.out.println("---- Get the first index ---");
        System.out.println(myList.get(0));
        System.out.println("---- Added Shree Ram at first index ---");
        myList.add(0, "Shree Ram");
        for(int i = 0, listSize = myList.size(); i < listSize; i++){
            System.out.println(myList.get(i));
        }

        myList.remove("Ram");
        System.out.println("------- after remove Ram (just remove first element)");
        for(String value: myList){
            System.out.println(value);
        }

        // LinkList Example >>
        System.out.println("------- LinkList Example >>");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        //numberList.add(2);
        //numberList.add(1);
        numberList.add(0,0);

        for(Integer number: numberList){
            System.out.println(number);
        }

        numberList.remove(0);
        System.out.println("after remove index >> ");

        numberList.remove(Integer.parseInt("2"));
        System.out.println("after remove obj >> ");

        for(Integer number: numberList){
            System.out.println(number);
        }

        // iterate list using java 8
        System.out.println("---- using java 8 ----------- ");
        numberList.stream().forEach(System.out::println);

        //remove some data using filter
        System.out.println("---- using java 8 filter ----------- ");
        numberList.stream().filter(value -> value > 2).forEach(System.out::println);
    }

}

