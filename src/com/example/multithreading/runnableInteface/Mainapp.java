package com.example.multithreading.runnableInteface;

// In this example, create a thread using implements Runnable interface.
// check the Runner calsss how to implements interface and override run method.
public class Mainapp {

    public static void main(String args[]) throws InterruptedException {
            Thread t1 = new Thread(new Runner());
            Thread t2 = new Thread(new Runner());

            t1.start();
            t2.start();

            t1.join();
            t2.join();

    }

}