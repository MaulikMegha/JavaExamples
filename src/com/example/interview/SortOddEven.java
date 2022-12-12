package com.example.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOddEven {
    public static void main(String args[]) {

        List<Integer> orderNumber = new ArrayList<>();
        orderNumber.add(2);
        orderNumber.add(5);
        orderNumber.add(4);
        orderNumber.add(1);
        orderNumber.add(9);
        orderNumber.add(8);
        orderNumber.add(3);
        orderNumber.add(6);
        orderNumber.add(7);

        // below solution is O(n^2)
        int length = orderNumber.size()-1;
        for(int i = 0; i < length; i++) {
            for(int j = i+1; j < length; j++ ){
                int x = orderNumber.get(i);
                if(x % 2 != 0) {
                    Collections.swap(orderNumber, i,j);
                }
            }
        }
        System.out.println(orderNumber);


    }
}
