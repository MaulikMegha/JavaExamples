package com.example.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String args[]){
        int[] input = {1, 4, 2, 3, 6, 8, 7, 5, 2};

        int sum = Arrays.stream(input).sum();
        int length = input.length - 1;
        int sumNumber = length * (length+1)/2;

        int duplicateNumber = sum - sumNumber;
        System.out.println(duplicateNumber);

        // second approach using collection
        Set<Integer> set = new HashSet<>();
        int n = input.length;
        for(int i = 0; i < n; i++){
            if(!set.add(input[i])){
                System.out.println(input[i]);
            }
        }
    }
}