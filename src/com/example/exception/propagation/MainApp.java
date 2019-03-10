package com.example.exception.propagation;

public class MainApp {

    void third() {
        int data = 50/0;
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
        MainApp obj = new MainApp();

        obj.first();

        System.out.println("normal flow ...");
    }
}

/*
Output:
exception handled
normal flow ...
*/