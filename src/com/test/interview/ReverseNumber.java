package com.test.interview;

public class ReverseNumber {
    public static void main(String args[]) {
        int input = 17868;
        // output must be 86871
        // System.out.println(Integer.reverse(input));

        // StringBuilder sb = new StringBuilder(input+"");
        // System.out.println(sb.reverse().toString());

        int revers = 0;
        while (input != 0){
            revers = (revers*10)+(input%10);
            input = input / 10;
        }
        System.out.println(revers);

    }
}