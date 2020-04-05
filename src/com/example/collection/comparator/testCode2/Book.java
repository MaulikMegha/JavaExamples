package com.example.collection.comparator.testCode2;

import java.math.BigInteger;

public class Book {

    private String name;
    private BigInteger Isbn;
    private Double price;

    public Book(String name, BigInteger isbn, Double price) {
        this.name = name;
        Isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigInteger getIsbn() {
        return Isbn;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return this.getName()+" - isbn:"+this.getIsbn()+", $"+this.getPrice();
    }
}
