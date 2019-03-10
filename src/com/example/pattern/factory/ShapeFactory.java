package com.example.pattern.factory;

public class ShapeFactory {

    public Shape getShape(String type){
        if(type.equalsIgnoreCase("Square")){
            return new Square();
        } else if(type.equalsIgnoreCase("Circle")){
            return new Circle();
        } else {
            return null;
        }
    }
}