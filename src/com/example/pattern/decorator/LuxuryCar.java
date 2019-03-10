package com.example.pattern.decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car){
        super(car);
    }

    public void carData(){
        super.carData();
        System.out.println("Add Luxury car feature");
    }
}