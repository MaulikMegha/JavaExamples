package com.example.interview.priceline.nonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainApp {
    public static void main(String args[]){
        String input = "abcdgdcbax";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character c: input.toCharArray()){
            if(map.get(c) != null){
                int value = map.get(c);
                map.put(c, ++value);
            } else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non repeating Char is '"+entry.getKey()+"'");
                break;
            }
        }

    }
}