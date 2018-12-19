package com.test.hackerrank;

import java.util.Arrays;

public class NextSmallInt {
    public static void main(String args[]){
        int[] array = {-1, 1, 2, 3}; /*{1, 2, 3}; *//*{-1, -3};*/ /*{1, 3, 6, 4, 1, 2};*/
        System.out.println(solution(array)); // n log(n)
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int length = A.length;
        if(A[length-1] < 0)
            return 1;

        for(int i = 0; i < length-1; i++) {
            int current = A[i];
            int next = A[i+1];
            if(current != next && (current+1) != next){
                int result = A[i]+1;
                if(result > 0)
                return result;
            }
        }
        return A[length-1]+1;
    }

    public static int solutionB(int[] A) {

        return 0;
    }
}


