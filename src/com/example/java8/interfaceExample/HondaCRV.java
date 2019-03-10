package com.example.java8.interfaceExample;

public class HondaCRV implements Car{

    @Override
    public void wheel() {
        System.out.println("All wheel drive");
    }

    @Override
    public void engine() {
        System.out.println("V8 engine");
    }
}