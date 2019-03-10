package com.example.pattern.abstractFactory;

public class MainApp {
    public static void main(String args[]){

        FactoryProducer.getFactory("SHAPE").getShape("CIRCLE").draw();
        FactoryProducer.getFactory("COLOR").getColor("RED").fill();

        FactoryProducer.getFactory("SHAPE").getShape("SQUARE").draw();
        FactoryProducer.getFactory("COLOR").getColor("GREEN").fill();

    }
}