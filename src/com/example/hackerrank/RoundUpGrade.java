package com.example.hackerrank;

import java.util.Arrays;

public class RoundUpGrade {

    public static void main(String args[]) {
        int a[] = {73, 67, 38, 33};
        int number = 0;
        for(int i = 0; i < a.length; i++) {
            number = a[i];
            if(number >= 38) {
                for(int j = 0 ; j < 3; j++) {
                    int result = number+j;
                    System.out.println(result +" % 5 = "+(result % 5));
                    if((result % 5) == 0 ) {
                        a[i] = result;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
