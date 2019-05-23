package com.example.interview.ubs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CircularChar {

    public static void main(String args[]) {
        List<Integer> roll = new ArrayList<>();
        String s = "vwxyz";
        roll.add(5);
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(4);
        roll.add(5);
        // output : aaaaa

        // String s = "abc";
        /*roll.add(1);
        roll.add(3);*/
        // output : bcd

        Map<Integer,Character> charMap = new HashMap<>();
        for(int i = 97; i<= 122; i++){
            charMap.put(i, Character.toLowerCase((char)i));
        }
        // System.out.println(charMap);

        int numberOfRoll = roll.isEmpty() ? 0 : roll.get(0);
        for(int j = 1; j <= numberOfRoll; j++ ){
            String result = "";
            int currentRoll = roll.get(j);
            for(int k = 0; k < currentRoll; k++){
                int ascii = (int)s.charAt(k);
                ascii++;
                if(ascii > 122){
                    ascii = (ascii - 122) + 96;
                }
                result += charMap.get(ascii);

            }
            result += s.substring(currentRoll, s.length());
            s = result;
        }

        System.out.println(s);

    }

}