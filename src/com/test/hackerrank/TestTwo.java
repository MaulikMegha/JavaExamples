package com.test.hackerrank;

import java.util.Arrays;
import java.util.HashSet;

public class TestTwo {

	public static void main(String args[]) {
		String input = "5; 0,2,3,4,5 , 0";
		String inputs[] = input.split(";");
		//int length = Integer.parseInt(inputs[0].trim());
		//String values[] = inputs[1].split(",");
		HashSet<String> hashSet = new HashSet<>();
		
		/*for(int i = 0; i <= length; i++ ) {
			if(!hashSet.add(values[i].trim())) {
		        System.out.println(Integer.parseInt(values[i].trim()));
		    }
		}*/
		
		Arrays.stream(inputs[1].split(",")).forEach(value -> {
		    if(!hashSet.add(value.trim())) {
		        System.out.println(Integer.parseInt(value.trim()));
		    }
		});
	}
}
