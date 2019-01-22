package com.test.hackerrank;

import java.util.Stack;

public class HackerRankInString {
   /*
    Sample Input :
            2
            hereiamstackerrank
            hackerworld
    Sample Output :
            YES
            NO
   */

    public static void main(String[] args) {
        String compareString = "hackerrank";
        StringBuffer compareStringBuffer = new StringBuffer(compareString);
        Stack stack = new Stack();
        for(Character c : compareStringBuffer.reverse().toString().toCharArray() ){
            stack.push(c);
        }

        String input = "hhaacckkekraraannk";

        for(char c : input.toCharArray()){
           if(!stack.isEmpty() && stack.peek().equals(c)){
                stack.pop();
            }
        }

       if(stack.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}