package com.test.hackerrank;

public class MarsExploration {
    public static void main(String args[]) {
        String input = "SOSSPSSQSSOR";
        int length = input.length();

        int count = 0;
        for(int i = 0, j = 1, k = 2; i < length; ){
            if(input.charAt(i) != 'S'){
                count++;
            }
            if(input.charAt(j) != 'O'){
                count++;
            }
            if(input.charAt(k) != 'S'){
                count++;
            }
            i += 3;
            j += 3;
            k += 3;
        }

       /*
        input = "SOSSPSSQSSOR";
        output : 3
        input =  "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";
        output : 20
        */

        System.out.println("missing messages count : "+count);
    }

}