package com.example.interview.honestBUILDINGS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public static void main(String args[]){
        String input = "aabbcd";
        String resultPermutation = "dabcab";

        // below solution using inbuilt method
        char cArray[] = input.toCharArray();
        Arrays.sort(cArray);

        char cArray2[] = resultPermutation.toCharArray();
        Arrays.sort(cArray2);

        if(String.valueOf(cArray).equalsIgnoreCase(String.valueOf(cArray2))){
            System.out.println("Permutation");
        } else {
            System.out.println("Not-Permutation");
        }

        // now implements using collection
        Map<Character, Integer> map = new HashMap<>();
        int length = input.length();
        for(int i = 0; i < length; i++){
            char c = input.charAt(i);
            if(map.get(c) != null){
                int value = map.get(c);
                map.put(c, ++value);
            } else {
                map.put(c, 1);
            }
        }

        int ln = resultPermutation.length();
        for(int j = 0; j < ln; j++){
            char c = resultPermutation.charAt(j);
            if(map.get(c) != null){
                int value = map.get(c);
                map.put(c, --value);
            } else {
                map.put(c, 1);
            }
        }

        boolean isPermutation = true;
        for(Map.Entry<Character, Integer> entry  : map.entrySet()){
            if(entry.getValue() != 0){
                isPermutation = false;
            }
        }

        System.out.println(isPermutation ? "Permutation" : "Not-Permutation");

    }

}