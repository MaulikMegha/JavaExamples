package com.example.interview;

import java.util.*;

public class NonRepeatingNumber {
    public static void main (String args[]){
        int myArray[] = {1, 4, 2, 5, 7, 1, 2, 5, 2, 7, 9, 1, 4, 3, 7, 3};
        List<Integer> myList = new ArrayList<>();

        Arrays.sort(myArray);

        // two for loop but still complexity O(n)
        for(int i = 0; i < myArray.length; i++) {
            int number = myArray[i];
            boolean isDuplicate = false;
            for(int j = i+1; j <  myArray.length; j++) {
                if(number == myArray[j]) {
                    isDuplicate = true;
                    continue;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if(!isDuplicate) {
                myList.add(number);
            }
        }

        for(Integer result: myList){
            System.out.println("Unique value = "+result);
        }

        System.out.println("---------------------------");
        // try with Map
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < myArray.length; i++) {
            int count =  1;
            int iCount = 0;
            if(myMap.containsKey(myArray[i])){
                iCount = myMap.get(myArray[i]);
            }
            myMap.put(myArray[i], iCount+count);
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            // System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            if(entry.getValue() == 1) {
                System.out.println("Unique element = "+entry.getKey());
            }
        }

        // java 8
        myMap.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .forEach(x -> System.out.println("Java 8 : unique element = " + x.getKey()));

    }

}