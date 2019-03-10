package com.example.alorithm;

import java.util.Arrays;

public class Quicksort {
    public static void main(String args[]) {
        int array[] = {7,2,1,6,8,5,3,4};

        System.out.println("unSorted array : "+ Arrays.toString(array));

        quickSort(array, 0, array.length-1);

        System.out.println("Sorted array : "+Arrays.toString(array));
    }

    public static void quickSort(int a[], int startIndex, int endIndex) {

        if(startIndex < endIndex) {
            int pIndex = partition(a, startIndex, endIndex);

            quickSort(a, startIndex, pIndex - 1);

            quickSort(a, pIndex + 1, endIndex);
        }

    }

    public static int partition(int a[],int start,int end) {
        int pivot = a[end];
        int pIndex = start;
        int swap = 0;

        for(int i = start; i < end; i++){
            if(a[i] <= pivot){
                swap = a[i];
                a[i] = a[pIndex];
                a[pIndex] = swap;
                pIndex++;
            }
        }
        swap = a[end];
        a[end] = a[pIndex];
        a[pIndex] = swap;

        return pIndex;
    }

}