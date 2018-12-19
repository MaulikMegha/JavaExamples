package com.test.multithreading.multiLocks;

public class MainApp {

    public static void main(String args[]) {
        Worker worker = new Worker();
        worker.testTime();
    }
}