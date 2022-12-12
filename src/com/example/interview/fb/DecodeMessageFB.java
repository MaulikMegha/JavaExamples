package com.example.interview.fb;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessageFB {
    public static void main(String args[]) {
        Map<Integer, Character> map = new HashMap<>();

        // build the map 1:a,2:b .... 26:z
        int charInt = 97;
        for(int i = 1; i < 27 ; i++){
            map.put(i, (char) charInt);
            charInt++;
        }
        //display the map
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        String input = "121";
        // output must be 3, we can build "aba" , "la" , "au"

        System.out.println("result : "+decode(input, input.length()));

    }

    public static int decode(String input, int k){
        if( k == 0 ){
            return 1;
        }
        int s = input.length() - k;
        if( Character.getNumericValue(input.charAt(s)) == 0){
            return 1;
        }

        int result = decode(input, k-1);
        if(k >= 2 && Integer.parseInt(input.substring(s, s+2)) <= 26){
            result += decode(input, k-2);
        }

        return result;
    }
}