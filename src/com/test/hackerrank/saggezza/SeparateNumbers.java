package com.test.hackerrank.saggezza;

public class SeparateNumbers {

    public static void main(String args[]){
        String input = "999100010001";
        // input
        /*1234
        91011
        99100
        101103
        010203
        13
        1
        99910001001
        7891011
        9899100
        999100010001*/

        //output
        /*YES 1
        YES 9
        YES 99
        NO
        NO
        NO
        NO
        YES 999
        YES 7
        YES 98
        NO*/

        separateNumbers(input);
    }

    static void separateNumbers(String input){
        int length = input.length();
        int mid = length/2;
        int low = 0;
        boolean isMatch = false;
        for(int i = 0; i < mid; i++){
            int number = Integer.parseInt(input.substring(0,i+1));
            low = number;
            String s = "";
            while(s.length() <= length && !isMatch) {
                s = s + number++;
                if(input.equals(s)){
                    System.out.println("YES "+low);
                    isMatch = true;
                }
            }
        }

        if(!isMatch){
            System.out.println("NO");
        }

    }
}