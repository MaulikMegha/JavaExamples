package com.test.collection.map;

import java.util.*;

public class MainApp {

    public static void main(String args[]) {

        // prepaid data
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Maulik", "Book"));
        customerList.add(new Customer("Kamini", "TV"));
        customerList.add(new Customer("Maulik", "CD"));
        customerList.add(new Customer("Bhavin", "Book"));
        customerList.add(new Customer("Bhavin", "CD"));
        customerList.add(new Customer("Bhavin", "TV"));
        customerList.add(new Customer("Rucha", "Book"));

        customerList.stream().forEach(c -> {
            System.out.println(c.getName()+" : "+c.getItem());
        });

        // now build the map base on customer name and assign all related item to that customer.
        // after building a map find out who did first time order.

        Map<String, List<String>> customerMap = new HashMap<>();

        customerList.stream().forEach(c -> {
            if(customerMap.get(c.getName()) != null && (!customerMap.get(c.getName()).isEmpty())){
                List<String> ls = new ArrayList<>();
                ls.addAll(customerMap.get(c.getName()));
                ls.add(c.getItem());
                customerMap.put(c.getName(), ls);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(c.getItem());
                customerMap.put(c.getName(),ls);
            }
        });

        System.out.println("************ Display first time buyer *********");
        customerMap.forEach((k, v) -> {
            if(v.size() == 1){
                System.out.println((k + ":" + v));
            }
        });
    }
}