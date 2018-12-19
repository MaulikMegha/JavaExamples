package com.test.collection.comparable;

import com.test.collection.equalsHashCode.Car;

public class Student implements Comparable<Student>{
    private int rollNumber;
    private String fName;
    private String lName;

    Student(int rollNumber, String fName, String lName){
        this.rollNumber = rollNumber;
        this.fName = fName;
        this.lName = lName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public int compareTo(Student student){
        // return this.getfName().compareTo(student.getfName()); // String compare
        if(this.getRollNumber() > student.getRollNumber()){
            return 1;
        } else if(this.getRollNumber() < student.getRollNumber()){
           return -1;
        }
        return 0;
    }

    public String toString(){
        return this.getRollNumber()+" -> "+this.getfName() +" "+this.lName;
    }
}