package com.example.array;

public class TwoMaxNumber {
    public static void main(String args[]){
        int[] arr = {4, 2, 6, 1, 5, 8, 7};

        int first = 0;
        int second = 0;
        int length = arr.length;
        for(int i = 0; i < length; i++){
            int n = arr[i];
            if(first < n){
                second = first;
                first = n;
            } else if (second < n){
                second = n;
            }
        }

        System.out.println(first);
        System.out.println(second);

    }
}