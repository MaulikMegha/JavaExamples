package com.test.hackerrank;

import java.util.Arrays;

public class AbigSum {
    public static void main(String args[]) {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        // OLD way, using for loop
        int length = ar.length;
        long result = 0L;
        for(int i = 0; i < length; i++) {
            result += ar[i];
        }
        System.out.println("result = "+result);

        // NEW way, using stream Java 8
        System.out.println("result = "+ Arrays.stream(ar).sum());
    }
}