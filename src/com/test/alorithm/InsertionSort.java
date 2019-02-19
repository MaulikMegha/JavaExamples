package com.test.alorithm;

import java.util.Arrays;

// Big O for insertion sort is O(n^2)
public class InsertionSort {
    public static void main(String args[]) {
        int[]  array =  {3, 6, 2, 8, 1, 5, 9, 7, 4};
        int length = array.length;

        System.out.println("unsorted array : "+ Arrays.toString(array));

        for(int i = 0; i < length; i++){
            int value = array[i];
            int hole = i;
            while(hole > 0 && array[hole-1] > value){
                array[hole] = array[hole-1];
                hole = hole - 1 ;
            }

          /*if(array[i] > array[i+1]){
               int temp = array[i+1];
               array[i+1] = array[i];
               array[i] = temp;
               i = -1;
           }*/
        }

        System.out.println("sorted array : "+ Arrays.toString(array));

    }
}