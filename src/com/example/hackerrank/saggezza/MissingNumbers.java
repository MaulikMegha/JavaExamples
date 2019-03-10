package com.example.hackerrank.saggezza;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
    public static void main(String args[]) {
       /* int[] missingArray = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] originArray = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};*/

        int[] missingArray = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        int[] originArray = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};

        missingNumbers(missingArray, originArray);

    }

    static int[] missingNumbers(int missingArray[],int originArray[]){
        int missingLength = missingArray.length;
        int originLength = originArray.length;

        System.out.println("missingLength = "+missingLength);
        Set<Integer> treeSet = new TreeSet<>();

        for(int j = 0, i = 0; j < originLength && i < missingLength; ){
            if(missingArray[i] == originArray[j]){
                i++;
                j++;
            } else {
                treeSet.add(originArray[j]);
                j++;
            }
            if(i == missingLength){
                System.out.println("i = "+originArray[i]);
                for(int m = j; m < originLength ; m++){
                    treeSet.add(originArray[m]);
                }
            }
        }

        int[] result = new int[treeSet.size()];
        int k = 0;
        for(Integer value : treeSet){
            result[k++] = value;
            System.out.print(value+" ");
        }
        // treeSet.stream().forEach(System.out::println);

        // Integer[] result = treeSet.toArray(new Integer[treeSet.size()]);

        /*for(Integer value : result){
            System.out.print(value+" ");
        }*/

        return result;
    }
}