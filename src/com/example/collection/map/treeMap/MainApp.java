package com.example.collection.map.treeMap;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class MainApp {
    public static void main(String args[]){
        Map<String, Integer> map = new TreeMap<>();
        map.put("Bhavin",37);
        map.put("Maulik",35);
        map.put("Kamini",34);
        map.put("Rucha",35);

        // treeMap default sort on KEY
        for(String key: map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }

        // Q. how we can sort a map by values?

        // step 1 create a list from map
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());

        // step 2 sort the list using comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // step 3 now we have sorted list, iterator and put in new Map
        Map<String, Integer> sortMapValue = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> tmpMap :  list) {
            sortMapValue.put(tmpMap.getKey(), tmpMap.getValue());
        }

        // result display - sorted map by values
        System.out.println("**** sorted Map base on value*****");
        for(String key : sortMapValue.keySet()){
            System.out.println(key+" : "+sortMapValue.get(key));
        }


        // using JAVA 8
        System.out.println("*** JAVA 8 way ****");
        map.entrySet()
                .stream()
                .sorted(comparingByValue())
                .forEach(o -> {
                    System.out.println(o.getKey() + " : "+o.getValue());
                });

        Map<String, String> errors = new HashMap<>();
        errors.put("DUPLICATE_EMAIL","Customer with the supplied email address already exists.");
        errors.put("EMAIL_BANNED","Email address not allowed, please use another email address.");
        errors.put("INVALID_DOMAIN","' is not a valid domain");

    }

}