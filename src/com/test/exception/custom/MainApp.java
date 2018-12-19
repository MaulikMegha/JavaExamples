package com.test.exception.custom;

public class MainApp {
    static void validate(int age) throws InvalidAgeExcepation {
        if(age <= 0)
            throw new InvalidAgeExcepation("Age must be greater than 0");

    }

    public static void main(String args[]) {

        try {
            validate(0);
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }

        System.out.println("Code will be continue");
    }
}