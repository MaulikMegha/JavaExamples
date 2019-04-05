package com.example.interview.saggezza;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSortPart {
    public static void main(String args[]) {
        // int[] input = {1,2,4,5,3};
        // int[] input = {2, 4, 6, 8, 3};
        int[] input = {2, 4, 6, 8, 1};
        int length = input.length;
        int value = input[length - 1];
        boolean isShort = false;

        for(int i = length-2; i  >= 0 ; i--) {
            int current = input[i];
            if(current > value) {
                input[i+1] = current;
            } else {
                input[i+1] = value;
                isShort = true;
            }
            IntStream stream1 = Arrays.stream(input);
            stream1.forEach(x -> System.out.print(x+" "));
            System.out.println();

            // System.out.println(Arrays.toString(input));
            if(isShort) {
                break;
            }
        }
        if(!isShort){
            input[0] = value;
            IntStream stream1 = Arrays.stream(input);
            stream1.forEach(x -> System.out.print(x+" "));
        }

    }
}