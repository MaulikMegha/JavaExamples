package com.test.alorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    // selection sort Big O = O(n^2)
    public static void main(String args[]) {
        int[]  array = {3, 6, 2, 8, 1, 5, 9, 7, 4};
        int length = array.length;

        System.out.println("unsorted array : "+ Arrays.toString(array));

        for(int i = 0; i < length; i++){
            for(int j = i+1; j < length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("sorted array : "+ Arrays.toString(array));

    }
}