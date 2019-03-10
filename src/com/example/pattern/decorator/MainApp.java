package com.example.pattern.decorator;

public class MainApp {
    public static void main(String args[]) {

        // just a car..
        Car baseCar = new BasicCar();
        baseCar.carData();

        //Its not just a car, its a sport car..
        System.out.println("*** Sport Car ***");
        Car sportCar = new SportCar(new BasicCar());
        sportCar.carData();

        //lets say luxury sport car..
        System.out.println("*** Luxury Sport Car ***");
        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.carData();

    }
}