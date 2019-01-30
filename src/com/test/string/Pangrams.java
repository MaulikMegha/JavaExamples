package com.test.string;

import java.util.*;

public class Pangrams {
    public static void main(String args[]) {
        String input = "We promptly judged antique ivory buckles for the next prize";
        //input : "We promptly judged antique ivory buckles for the next prize";
        //output : pangram ( The string contains a to z )
        //input : We promptly judged antique ivory buckles for the prize
        //output : not pangram ( The string lacks an x. )

        Map<Character, Integer> characterMap = new HashMap<>();
        characterMap.put(' ', 0);
        for(int i = 65; i <= 90 ; i++) {
            characterMap.put(Character.toUpperCase((char) i), 0);
        }

        boolean isPangram = true;
        for(Character c : input.toCharArray()) {
            characterMap.put(Character.toUpperCase(c), 1);
        }

        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
            if(entry.getValue() == 0){
                isPangram = false;
            }
        }

        System.out.println(isPangram ? "pangram" : "not pangram");
    }
}