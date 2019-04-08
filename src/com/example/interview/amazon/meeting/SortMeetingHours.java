package com.example.interview.amazon.meeting;

import java.util.Comparator;

public class SortMeetingHours implements Comparator<Meeting> {

    public int compare(Meeting m1, Meeting m2){
        if(m1.getHours() > m2.getHours()){
            return 1;
        } else if(m1.getHours() < m2.getHours()){
            return -1;
        }
        return 0;
    }

}