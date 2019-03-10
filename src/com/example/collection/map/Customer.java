package com.example.collection.map;

public class Customer {

    private String name;
    private String item;

    public Customer(String name,String item) {
        this.name = name;
        this.item = item;
    }

    public String getName(){
        return this.name;
    }

    public String getItem(){
        return this.item;
    }

}