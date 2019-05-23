package com.example.interview;

public class FibonacciNumber {
    public static void main(String args[]) {
        int n = 7;
        System.out.println("Recursion >> "+fibo(n));
        System.out.println("non-Recursion >> "+nonRecursionFibo(n));
    }

    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int nonRecursionFibo(int n) {
        int p1 = 0;
        int p2 = 1;
        int result = 0;
        for(int i =1; i < n; i++){
            result = p1 + p2;
            p1 = p2;
            p2 = result;
        }

        return result;
    }

}