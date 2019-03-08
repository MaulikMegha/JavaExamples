package com.test.array;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String args[]){
        int[] inputs = {1, 4, 2, 3, 6, 8, 7};
        int sum = Arrays.stream(inputs).sum();

        int numbLength = inputs.length + 1;
        int sumNumber  = numbLength * (numbLength+1)/2;

        int missingNumber = sumNumber - sum;
        System.out.println(missingNumber);

    }
}