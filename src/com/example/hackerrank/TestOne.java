package com.example.hackerrank;

import java.util.stream.IntStream;

public class TestOne {

	public static void main(String args[]) {
		String input = "10";
		int n = Integer.parseInt(input);
	    int sum = 0;
		/*for(int i = 1; i <= n; i++ ) {
		    if(i % 5 != 0 && i % 7 != 0)
		        sum += i;
		}*/
		
		sum = IntStream.range(1, n)
				.filter(num -> num % 5 != 0 && num % 7 != 0)
				.sum();
		
       /* .forEach(i -> {
        		if(i % 5 != 0 && i % 7 != 0)
		        sum += i;
        });*/
		System.out.println(sum);
	}
	
}
