package com.test.multithreading.multiLocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private Random random = new Random();
    private List<Integer> listOne = new ArrayList<>();
    private List<Integer> listTwo = new ArrayList<>();

    private Object LockOne = new Object();
    private Object LockTwo = new Object();

    // make synchronized method take twice time, that's why we use block and two different lock
    //  public synchronized void workOne() {
    public void workOne() {
        synchronized (LockOne){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            listOne.add(random.nextInt(100));
        }
    }

    // make synchronized method take twice time(>200), that's why we use block and two different lock
    //  public synchronized void workTwo() {
    public void workTwo() {
        synchronized (LockTwo){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            listTwo.add(random.nextInt(100));
        }
    }

    public void process(){
        for(int i = 0; i < 100; i++){
            workOne();
            workTwo();
        }
    }

    public void testTime() {
        System.out.println("Starting ...");

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("time taken "+ (end-start));
        System.out.println("List One size "+listOne.size());
        System.out.println("List Two size "+listTwo.size());
    }

}