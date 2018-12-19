package com.test.multithreading.runnableInteface;

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