package com.example.multithreading.threadClass;

// In this example, create a thread using extends Thread class.
// check the Runner class, how to extends and override run method.
public class MainApp {
    public static void main(String args[]) throws InterruptedException{
        Thread t1 = new Runner();
        Thread t2 = new Runner();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}