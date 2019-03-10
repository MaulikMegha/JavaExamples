package com.example.multithreading.synchroniz;


public class MainApp {

    private static int count = 0;

    // due to syncronized keyword, only one thread can access this method..
    // and we can ignore erroneous and unforeseen result.
    public synchronized void increment(){
        count++;
    }

    public static void main(String args[]){
        MainApp app = new MainApp();
        app.process();
        System.out.println(count);
    }

    public void process() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }

}