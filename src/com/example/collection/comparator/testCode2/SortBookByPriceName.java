package com.example.collection.comparator.testCode2;

import java.util.Comparator;

public class SortBookByPriceName implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() == b2.getPrice()) {
            return b1.getName().compareTo(b2.getName());
        } else {
            return -1;
        }
    }
}
