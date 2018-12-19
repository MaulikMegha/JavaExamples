package com.test.collection.set;

import java.util.Iterator;

public class HashSetNLinkHashSet {
    public static void main(String args[]) {
        java.util.HashSet<String> mySet = new java.util.HashSet<>();

        mySet.add("bhavin");
        mySet.add("Rucha");
        mySet.add("Kamini");
        mySet.add("maulik");
        mySet.add("maulik");
        mySet.add("maulik");

        Iterator<String> result = mySet.iterator();
        while (result.hasNext()){
            System.out.println(result.next());
        }

        System.out.println("-------------------------------------");

        java.util.LinkedHashSet<String> myLinkSet = new java.util.LinkedHashSet<>();
        myLinkSet.add("bhavin");
        myLinkSet.add("Rucha");
        myLinkSet.add("Kamini");
        myLinkSet.add("maulik");
        myLinkSet.add("maulik");

        Iterator<String> resultLink = myLinkSet.iterator();
        while (resultLink.hasNext()){
            System.out.println(resultLink.next());
        }
    }
}
