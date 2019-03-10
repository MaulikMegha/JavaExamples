package com.example.multithreading.waitNotify;

import java.util.LinkedList;

public class LowLevelProcessor {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT  = 10;
    private Object lock = new Object();


    public void produce() throws InterruptedException {

        int customer = 0;
        while (true) {

            synchronized (lock) {
                while(list.size() == LIMIT) {
                    lock.wait();
                }

                list.add(customer++);
                lock.notify();
            }

        }
    }

    public void consume() throws InterruptedException {

        while (true) {
            synchronized (lock) {
                while(list.size() == 0) {
                    lock.wait();
                }

                int value  = list.removeFirst();
                System.out.println("customer served: " + value);
                lock.notify();
            }
            Thread.sleep(1000);

        }
    }
}