package com.test.interview;

public class ArmstrongNumber {
    public static void main(String args[]){
        int input = 153;

        String s = input+"";
        int length = s.length();
        int sum = 0;

        for(int i = 0; i < length; i++){
            sum += Math.pow(Character.getNumericValue(s.charAt(i)), length);
        }

        System.out.println(input == sum ? "Armstron-number" : "just-num");

    }
}