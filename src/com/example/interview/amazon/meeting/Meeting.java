package com.example.interview.amazon.meeting;

public class Meeting {
   String name;
   float hours;

    public Meeting(String name, float hours){
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}