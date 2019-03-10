package com.example.exception.propagation;

public class MainApp2 {
    void third(){
        //checked exception
        // throw new java.io.IOException("device error");

        //unchecked exception
        // throw new java.lang.ArithmeticException("bad value");
    }

    void second() {
        third();
    }

    void first() {
        try {
            second();
        } catch(Exception e){
            // e.printStackTrace();
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]){
        MainApp2 obj2 = new MainApp2();

        obj2.first();

        System.out.println("normal flow ...");
    }
}