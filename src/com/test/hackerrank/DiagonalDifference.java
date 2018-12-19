package com.test.hackerrank;

public class DiagonalDifference {
    public static void main(String args[]){
        int[][] arr = { { 11, 2, 4 }, { 4, 5, 6 }, {10,8,-12} };
        int length = arr[0].length;
        int toRight = 0;
        int toLeft = 0;
        int result = 0;
        for(int i = 0; i < length; i++){
            toRight += arr[i][i];
            toLeft += arr[i][length-1-i];
        }
        System.out.println(toRight);
        System.out.println(toLeft);

        result = toRight - toLeft;
        System.out.println(Math.abs(result));
    }
}
