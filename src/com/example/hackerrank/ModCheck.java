package com.example.hackerrank;

public class ModCheck {
    public static void main(String args[]) {
        String input = "15";
        int n = Integer.parseInt(input);
        int sum = 0;
        for(int i = 1; i <= n; i++ ) {
            if(i % 5 != 0 && i % 7 != 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
