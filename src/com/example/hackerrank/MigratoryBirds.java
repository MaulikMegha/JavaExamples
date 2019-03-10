package com.example.hackerrank;

import java.util.*;

public class MigratoryBirds {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);


        for(int i = 0; i < list.size(); i++) {
            int value = list.get(i) > 0 && list.get(i) < 6 ? map.get(list.get(i)) : -1;
            if(value >= 0 ){
                map.put(list.get(i),++value);
            }
        }

        // int result = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        // System.out.println(result);

        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Iterate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
                break;
            }
        }


        /*for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" - "+entry.getValue());
        }*/
    }
}