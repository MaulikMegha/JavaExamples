package com.example.multithreading.countdownLatches;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable {
    CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    public void run(){
        System.out.println("start countDownLatch");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }

        countDownLatch.countDown();
    }
}