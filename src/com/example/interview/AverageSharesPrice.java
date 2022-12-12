package com.example.interview;

import java.util.HashMap;
import java.util.Map;

public class AverageSharesPrice {

    public static void main(String args[]) {
        Map<Integer,Float> myMap = new HashMap<>();

        //apple-stock
        //myMap.put(40, 165.60f);
        //myMap.put(10, 142.00f);  //avg. 160

        //AMD
        //myMap.put(40, 97.29f);
        //myMap.put(10, 68.90f); //avg. 91

        //NVDA
        //myMap.put(20, 206.32f);
        //myMap.put(10, 132.60f); //avg. 181

        int numberOfShares = 0;
        int totalPrice = 0;
        for(Map.Entry<Integer,Float> iMap : myMap.entrySet()) {
            totalPrice += iMap.getKey() * iMap.getValue();
            numberOfShares += iMap.getKey();
        }
       System.out.println("#"+numberOfShares +" with total price $" +totalPrice+ "  and avg. $"+(totalPrice/numberOfShares));

    }
}
