package com.example.collection.comparator.testCode2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {

    public static void main(String args[]) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Effective Java, 3rd Edition", new BigInteger("0134685997"), 29.45));
        list.add(new Book("Java: The Complete Reference, Eleventh Edition",  new BigInteger("1260440230"), 34.20));
        list.add(new Book("Head First Java: A Brain-Friendly Guide 2nd Edition",  new BigInteger("0596009208"), 31.00));

        System.out.println("** before sorting .....");
        list.stream().forEach(System.out::println);

        System.out.println("** after custom sorting .....");
        Collections.sort(list, new SortBookByPriceName());
        list.stream().forEach(System.out::println);
    }
}
