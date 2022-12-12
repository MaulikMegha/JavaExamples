package com.example.multithreading.waitNotify;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Produce thread running ...");
            wait();
            System.out.println("Resume");
        }

    }

    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Waiting for return key.");
            sc.nextLine();
            System.out.println("return key pressed");
            notify();
            System.out.println("resume after 2 testCode2..");
            Thread.sleep(2000);
        }
    }
}