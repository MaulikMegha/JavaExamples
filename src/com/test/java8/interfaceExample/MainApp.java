package com.test.java8.interfaceExample;

public class MainApp {
    public static void main(String args[]){

        System.out.println("*** Honda CRV ***");
        CarFactory.getCar("CRV").wheel();
        CarFactory.getCar("CRV").engine();
        CarFactory.getCar("CRV").color();
        CarFactory.getCar("CRV").door();
        Car.roof();

        System.out.println(" ");

        System.out.println("*** Honda Civic ***");
        CarFactory.getCar("Civic").wheel();
        CarFactory.getCar("Civic").engine();
        CarFactory.getCar("civic").color();
        CarFactory.getCar("Civic").door();
        new HondaCivic().roof(); // or - Car.roof();
    }
}