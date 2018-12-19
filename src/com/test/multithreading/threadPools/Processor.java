package com.test.multithreading.threadPools;

public class Processor implements Runnable {

    private int id;

    public Processor(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Start process id - "+id);

        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("End process id - "+id);
    }
}