package com.test.pattern.abstractFactory;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("Square")){
            return new Square();
        } else if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        } else {
            return null;
        }
    }

    public Color getColor(String color){
        return null;
    }
}