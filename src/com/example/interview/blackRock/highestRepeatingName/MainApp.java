package com.example.interview.blackRock.highestRepeatingName;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String args[]){

        String[] input = {"Maulik", "Kamini", "Bhavin" , "Kamini", "Maulik", "Rucha", "Kamini", "Aaru", "Vansh", "Aaru", "Aaru", "Bhavin", "Bhavin"};

        Map<String, Integer> map = new TreeMap<>();
        for(String s : input){
            if(map.get(s)!= null){
                int value = map.get(s);
                map.put(s, ++value);
            } else {
                map.put(s,1);
            }
        }

        System.out.println(map);

        // once we have map - build new Map or Shorted_Set
        Map<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        String firstKey = result.keySet().stream().findFirst().get();
        System.out.println(firstKey);

       /*TreeSet<String> set = new TreeSet<>();
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(data -> set.add(data.getKey()));
        System.out.println(set.first());*/


        // this is the second way using Java 8 : you can find max value - Key & Value
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        Integer maxCount =  Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        // System.out.println(key + " : "+maxCount);

        TreeSet<String> treeSet = new TreeSet<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount){
                treeSet.add(entry.getKey());
            }
        }
        System.out.println(treeSet.first()+ " <-first & last-> " +treeSet.last());

    }
}