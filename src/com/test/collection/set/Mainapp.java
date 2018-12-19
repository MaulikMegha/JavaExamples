package com.test.collection.set;

import java.util.Iterator;

public class Mainapp {

    public static void main(String args[]) {
        java.util.HashSet<String> mySet = new java.util.HashSet<>();

        mySet.add("bhavin");
        mySet.add("Rucha");
        mySet.add("Kamini");
        mySet.add("maulik");
        mySet.add("maulik");

        Iterator<String> result = mySet.iterator();
        while (result.hasNext()){
            System.out.println(result.next());
        }

        String s = "MAULIK";
        System.out.println(mySet.contains("MAULIK"));
        System.out.println(mySet.stream().anyMatch(s::equalsIgnoreCase));
    }
}