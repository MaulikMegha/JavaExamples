package com.test.pattern.abstractFactory;

public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shape){
      return null;
    }

    public Color getColor(String color){
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else {
            return null;
        }
    }
}