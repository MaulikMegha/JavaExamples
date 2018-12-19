package com.test.multithreading.threadClass;

class Runner extends Thread {

    @Override
    public void run(){
        for(int j = 0; j < 10 ; j++){
            System.out.println("Hi "+j);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}