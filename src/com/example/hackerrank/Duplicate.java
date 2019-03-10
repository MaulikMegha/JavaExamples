package com.example.hackerrank;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {

    public static void main(String args[]) {
        String input = "5; 1,2,3,4,5,4";
        String inputs[] = input.split(";");
        /*int length = Integer.parseInt(inputs[0]);
        String[] array = inputs[1].split(",");
        int[] arr = new int[length];
        for(int i = 0; i < length ; i++) {
            arr[i] = Integer.parseInt(array[i].trim());
        }
        printRepeating(arr, length);*/

        HashSet<String> hashSet = new HashSet<>();
        Arrays.stream(inputs[1].split(",")).forEach(value -> {
            if(!hashSet.add(value)) {
                System.out.println(Integer.parseInt(value.trim()));
            }
        });

    }

   /* public static void printRepeating(int arr[], int size)
    {
       System.out.println("The repeating elements are : ");

        for (int i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }*/
}
