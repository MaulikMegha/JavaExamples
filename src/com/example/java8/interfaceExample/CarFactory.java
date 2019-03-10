package com.example.java8.interfaceExample;

public class CarFactory {

    public static Car getCar(String car){
        if(car.equalsIgnoreCase("CRV")){
            return new HondaCRV();
        } else if(car.equalsIgnoreCase("CIVIC")){
            return new HondaCivic();
        }
        return null;
    }
}