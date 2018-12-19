package com.test.array;

import java.util.Arrays;

public class Equalize {
    public static void main(String args[]){
        //input = 3 3 2 1 3
            // remove 2 and 1
            // new array [3 3 3]
        //output = 2

        int[] arr = {1,2,2,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int length = arr.length;
        int maxCount = 0;
        int result = 0;
        for(int i = 0; i < length-1; i++){
            int value = arr[i];
            maxCount = 1;
            for(int j = i+1; j < length; j++){
                int next = arr[j];
                if (value == next){
                    maxCount++;
                } else {
                    break;
                }
            }
            result = result >= maxCount ? result : maxCount;
        }
        System.out.println("result = "+ (length - result));
    }
}