package com.example.exception.custom;

public class InvalidAgeExcepation extends Exception {
    InvalidAgeExcepation(String s){
        super(s);
    }
}