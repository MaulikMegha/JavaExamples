package com.test.hackerrank;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String args[]) {
        int[]  array = {3,8,9,7,6};
        int k = 3;
        int length = array.length;
        if(length != k){
            int[] newArray = new int[length];
            for(int i = length-k, j = 0; i < length; i++, j++) {
                newArray[j] = array[i];
            }
            for(int i = 0, j = k; i < k-1 ; i++, j++){
                newArray[j] = array[i];
            }
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
}
