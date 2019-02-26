package com.test.interview;

public class FindOddNumber {

    //question is find the odd number from given string array
    public static void main(String args[]){
         String array[] = {"12", "11", "9", "8", "1", "16"};


        // below solution is easy and every one think same..
        for (String s : array) {
            if(Integer.parseInt(s) % 2 != 0) {
                System.out.println(s);
            }
        }

        System.out.println();

        // interview now trick the question - neither wan't to use mod operation nor Integer conversion
        String pattern = "^\\d*[13579]$";
        for (String s : array) {
            if(s.matches(pattern)) {
                System.out.println(s);
            }
        }


    }
}