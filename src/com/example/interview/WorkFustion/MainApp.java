package com.example.interview.WorkFustion;

import java.util.Arrays;

public class MainApp {
    public static void main(String args[]){
        int[] input = {4,1,2,6,7,6,4,1,2,5,3,9,8};

        int length = input.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length-1; j++){
                if(input[i] > input[j+1]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}