package com.test.pattern.singleton;

public class MainApp {

    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();

        singleton.displayMessage();
    }
}