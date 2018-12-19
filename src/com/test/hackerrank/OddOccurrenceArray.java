package com.test.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrenceArray {
    public static void main(String args[]){
        int[] array = {9,3,9,3,9,7,9,7,2};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int count = map.get(array[i]);
                map.put(array[i], ++count);
            } else {
                map.put(array[i], 1);
            }
        }
        map.forEach((k,v) -> {
            if(v % 2 != 0) {
                System.out.println(k);
            }
        });

        /*for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                System.out.println(entry.getKey());
            }
        }*/
    }
}
