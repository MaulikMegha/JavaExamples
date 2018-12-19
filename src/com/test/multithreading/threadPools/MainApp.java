package com.test.multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String args[]) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 5; i++){
            executor.submit(new Processor(i));
        }

        executor.shutdown(); // its submit all thread
        System.out.println("All task submitted...");

        try{
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("All task completed...");
    }
}