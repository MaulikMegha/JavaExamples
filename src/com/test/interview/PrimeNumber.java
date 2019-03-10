package com.test.interview;

public class PrimeNumber {
    public static void main(String args[]) {
        int input = 8;
        boolean isPrime = true;

        // below code works fine, but not a strong solution
        /*if (input == 2 || input == 3 || input == 5 || input == 7 || input == 9){
            isPrime = true;
        } else if(input == 1 || input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0 || input % 9 == 0){
            isPrime = false;
        }*/

        for(int i = 2; i < input; i++){
            if(input % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "not-Prime");
    }
}