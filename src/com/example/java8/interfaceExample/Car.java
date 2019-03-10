package com.example.java8.interfaceExample;

// This interface has two default methods and one static method
public interface Car {

    public void wheel();
    public void engine();

    public default void color(){
        System.out.println("White color");
    }

    public default void door(){
        System.out.println("four doors car");
    }

    public static void roof() {
        System.out.println("Moon roof");
    }

}