package com.test.pattern.decorator;

public class SportCar extends CarDecorator {

    public SportCar(Car car){
        super(car);
    }

    public void carData(){
        super.carData();
        System.out.println("Add Sport car feature");
    }

}