package com.example.interview;


// IF some one ask for runtime polymorphism or dynamic methods or overriding, below is the example
public class RunTimePolymorphism {
    public static void main(String args[]) {
        Car obj = new BMW();
        obj.run();
    }
}

class Car {
    void run() {
        System.out.println("Car is running");
    }
}

class BMW extends Car{
    void run() {
        System.out.println("BMW is runnning safely with 80MPH");
    }
}