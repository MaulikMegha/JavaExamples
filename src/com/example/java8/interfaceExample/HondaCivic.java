package com.example.java8.interfaceExample;

public class HondaCivic implements Car{

    @Override
    public void wheel() {
        System.out.println("Two wheel drive");
    }

    @Override
    public void engine() {
        System.out.println("V4 engine");
    }

    @Override
    public void color(){
        System.out.println("Black color");
    }

    public void roof(){
        Car.roof();
    }
}