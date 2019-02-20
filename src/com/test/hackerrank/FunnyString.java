package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {

    public static void main(String args[]) {
        String s = "lmnop";
        int length = s.length();
        boolean isFunnyString = true;

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i= 0, j = length-1; i < length-1 ; i++, j--){
            int value1 = s.charAt(i);
            int value2 = s.charAt(i+1);
            int def1 = Math.abs(value2 - value1);

            int value3 = s.charAt(j);
            int value4 = s.charAt(j-1);
            int def2 = Math.abs(value4 - value3);

            if(def1 != def2) {
                isFunnyString = false;
            }
        }

        System.out.println(isFunnyString ? "Funny" : "Not Funny");
    }
}