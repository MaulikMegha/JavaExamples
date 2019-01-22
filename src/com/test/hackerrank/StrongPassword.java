package com.test.hackerrank;

public class StrongPassword {
    public static void main(String args[]) {
        String input = "#Password8";
        char aPassword[] = input.toCharArray();

        int minLength = 6;
        int passwordLength = input.length();
        int count = 0;

        boolean isUpperCase  = false;
        boolean isLowerCase  = false;
        boolean isNumber = false;
        boolean isSpecialChar  = false;

        for( int i : aPassword){
            if (i <= 90 && i >= 65) {
                isUpperCase = true;
            } else if(i >= 97 && i <= 122) {
                isLowerCase = true;
            } else if( i == 33 || i == 64 || i == 35 || i == 37 || i == 94 ||
                    i == 38 || i == 42 || i == 40 || i == 41 || i == 45 || i == 43 ) {
                isSpecialChar = true;
            } else if (i >= 48 && i <= 57 ) {
                isNumber = true;
            }
        }

        if(!isUpperCase) {
            count++;
        }
        if(!isLowerCase) {
            count++;
        }
        if(!isNumber) {
            count++;
        }
        if(!isSpecialChar) {
            count++;
        }

        int reminLength = minLength - passwordLength;
        System.out.println(reminLength > count ? reminLength : count);
    }
}