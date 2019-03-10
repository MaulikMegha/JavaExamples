package com.example.hackerrank;

import java.io.IOException;
import java.util.Arrays;

public class MissingNumber {

    // missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
    Arrays.sort(arr);
    Arrays.sort(brr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(brr));
    int[] crr = new int[brr.length - arr.length];
    int j = 0;
    int index = 0;
    for(int i = 0; i < arr.length; ) {
       if(arr[i]-brr[j] == 0){
           i++;
           j++;
       } else {
           crr[index] = brr[j];
           j++;
           index++;
       }
    }
    return crr;
    }


    public static void main(String[] args) throws IOException {
        int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

       System.out.println(Arrays.toString(missingNumbers(a, b)));
    }
}

        /* Input :
        int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
         */
        // output:
        /*
        [203, 203, 204, 204, 205, 205, 206, 206, 207, 208]
        [203, 203, 204, 204, 204, 205, 205, 205, 206, 206, 206, 207, 208]
        [204, 205, 206]
        */


        /* Input :
        int[] a = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        int[] b = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
        */
        // output:
        /*
        [4, 4, 7, 10, 11, 11, 11, 12, 13, 14]
        [3, 4, 4, 7, 7, 8, 10, 10, 11, 11, 11, 12, 12, 13, 14]
        [3, 7, 8, 10, 12]
        */