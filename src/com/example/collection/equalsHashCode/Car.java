package com.example.collection.equalsHashCode;

public class Car {
    private int vinNumber;
    private String model;
    private String color;
    private int year;

    Car(int vinNumber, String model, String color, int year) {
        this.vinNumber = vinNumber;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public int getVinNumber(){
       return this.vinNumber;
    }

    public void setVinNumber(int vinNumber){
        this.vinNumber = vinNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean equals(Object obj){
        if(obj != null && obj instanceof  Car){
            if(this.vinNumber ==  ((Car) obj).getVinNumber()){
             return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.vinNumber;
        // return this.model.hashCode();
    }

    public String toString(){
        return this.vinNumber +" - "+this.model+" - "+this.color+" - "+this.getYear();
    }
}