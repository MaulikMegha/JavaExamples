package com.example.hackerrank.saggezza;

public class BirthdayBar {
    public static void main(String args[]){
        int[] array = {1,2,1,3,2};
        int d = 3;
        int m = 2;
        int length = array.length;

        int count = 0;
        for(int i = 0; i < length-m; i++){
            int sum = 0;
            int k = i;
            int j = 1;
            while(j <= m){
               sum = sum + array[k];
               k++;
               j++;
            }
            if(sum == d)
                count++;

        }
        System.out.println(count);
    }
}
