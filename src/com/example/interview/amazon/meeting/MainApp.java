package com.example.interview.amazon.meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    static final float WORKING_HOURS = 8;

    public static void main(String args[]){
        List<Meeting> listOfMeeting = new ArrayList<>();
        listOfMeeting.add(new Meeting("meeting-1", 5));
        listOfMeeting.add(new Meeting("meeting-2", 3));
        listOfMeeting.add(new Meeting("meeting-3", 5));
        listOfMeeting.add(new Meeting("meeting-4", 0.5f));
        listOfMeeting.add(new Meeting("meeting-5", 0.5f));
        listOfMeeting.add(new Meeting("meeting-6", 2));

        // Collections.sort(listOfMeeting, new SortMeetingHours());

        //java8 custom sort on POJO on Hours.
        listOfMeeting.sort(Comparator.comparing(Meeting::getHours));

        List<String> resultList = new ArrayList<>();
        float totalMeetingHours = 0;
        for(Meeting m : listOfMeeting){
            float temp = totalMeetingHours + m.getHours();
            if(temp <= WORKING_HOURS){
                totalMeetingHours = temp;
                resultList.add(m.getName());
            }
        }

        System.out.println("# of meeting : "+resultList.size());
    }
}