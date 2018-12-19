package com.test.pattern.singleton;

public class Singleton {

    private static Singleton obj;

    private Singleton() {}

    public static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }

    public void displayMessage(){
        System.out.println("Hello World !");
    }


}