package com.test.interview;

public class Palindrome {
    public static void main(String args[]) {
        String s = "madam";
        int length= s.length();
        boolean isPalindrome = true;
        for(int i = 0; i < length/2; i++) {
            if (s.charAt(i) != s.charAt(length - (i + 1)))
                isPalindrome = false;
        }

        if(isPalindrome){
            System.out.println("Given String ("+s+") is Palindrome");
        } else {
            System.out.println("Given String ("+s+") is NOT Palindrome");
        }
    }
}