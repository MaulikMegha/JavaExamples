package com.test.interview;

import java.util.Arrays;

public class SynechronMatchSum {
    public static void main(String args[]) {
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int key = 6;
        int length = array.length;

        // below solution us not good, because time complexity : O(n^2)
        /*for(int i = 0 ; i < length; i++){
            for(int j = i+1; j < length; j++){
                if(array[i]+array[j] == key){
                    System.out.println(array[i] +" + "+array[j]+" = "+key);
                }
            }
        }*/


        //its little better then previous solution : O(n log n)
        /*for(int i = 0; i < length-1; i++){
            int value = array[i];
            int result = Arrays.binarySearch(array, (key-value));

            if(value + result == key) {
                System.out.println(value +" + "+result+" = "+key);
            }
        }*/

        //best solution Big O = O(n)
        for(int i = 0, j = length-1; i < j; ) {
            int x = array[i];
            int y = array[j];
            int sum = x + y;
            if(sum == key){
                System.out.println(x +" + "+y +" = "+key);
                i++;
                j--;
            } else {
                if(sum > key){
                    j--;
                }else {
                    i++;
                }
            }
        }


    }
}