package com.test.pattern.decorator;

public class BasicCar implements Car {

    @Override
    public void carData() {
        System.out.println("add basic car feature");
    }
}