package com.example.pattern.factory;

public class MainApp {
    public static void main(String args[]) {

        // without factory
        Shape shape = new Circle();
        shape.draw();
        Shape shape1 = new Square();
        shape1.draw();

        System.out.println("--------------------");

        // using factory
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("Square").draw();
    }
}