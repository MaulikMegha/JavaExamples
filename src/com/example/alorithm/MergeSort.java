package com.example.alorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
        int[]  array = {2,4,1,6,8,5,3,7};

        System.out.println("unSorted array : "+ Arrays.toString(array));

        // Big O for merge-sort is O(n log(n))
        mergeSort(array);

        System.out.println("Sorted array : "+Arrays.toString(array));

    }

    public static void mergeSort(int arr[]){
        int length = arr.length;
        if(length < 2)
            return;

        int n = length / 2 ;
        int leftArr[] = Arrays.copyOfRange(arr,0,n);
        int rightArr[] = Arrays.copyOfRange(arr,n,length);

        mergeSort(leftArr);
        mergeSort(rightArr);
        mergeArray(leftArr, rightArr, arr);
    }


    public static void mergeArray(int left[], int right[], int arr[]) {
        int nl = left.length;
        int nr = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nl && j < nr ) {
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < nl){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < nr){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}