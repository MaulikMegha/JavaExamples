package com.test.exception.custom;

public class InvalidAgeExcepation extends Exception {
    InvalidAgeExcepation(String s){
        super(s);
    }
}