package com.test.collection.comparable;

import java.util.Comparator;

public class SortByLname implements Comparator<Student> {

    @Override
    public int compare(Student studentA, Student studentB){
        int result = studentA.getlName().compareTo(studentB.getlName());
        if(result == 0){
            return studentA.getfName().compareTo(studentB.getfName());
        } else {
            return result;
        }
    }

}