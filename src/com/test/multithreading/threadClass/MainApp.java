package com.test.multithreading.threadClass;

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