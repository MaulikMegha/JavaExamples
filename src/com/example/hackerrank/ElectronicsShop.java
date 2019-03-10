package com.example.hackerrank;

public class ElectronicsShop {
    public static void main(String args[]) {

        int[] keyboards = {40,50,60};
        int[] drives = {5,8, 12};
        int b = 60;

        int kLength = keyboards.length;
        int dLength = drives.length;
        int result = -1;
        for(int i = 0; i < kLength; i++){
            for(int j = 0 ; j < dLength; j++){
                int sum = keyboards[i] + drives[j];
                if(sum <= b && result < sum){
                    result = sum;
                }
            }
        }

        System.out.println(result);

    }
}