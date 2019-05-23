package com.example.interview.tavant.EXm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

    public static void main(String args[]){
        List<Score> scoreList = new ArrayList<>();

        scoreList.add(new Score("s1", 30, "English"));
        scoreList.add(new Score("s1", 90, "Math"));
        scoreList.add(new Score("s1", 60, "English"));
        scoreList.add(new Score("s2", 80, "English"));
        scoreList.add(new Score("s2", 90, "Math"));
        scoreList.add(new Score("s2", 70, "Science"));
        scoreList.add(new Score("s3", 90, "Science"));

        // find the studentID go highest mark in each subject
     /*   Map<String, Score> map = new HashMap<>();
        for(Score s : scoreList){
                if(map.get(s.getSubject()) != null){
                    Score currentScore = map.get(s.getSubject());
                    if(s.getScore() > currentScore.getScore()){
                        map.put(s.getSubject(), s);
                    }
                } else  {
                    map.put(s.getSubject(), s);
                }
        }
        System.out.println(map);*/

        // create repo card base on student highest score
        Map<String, Map<String, Integer>> resultMap = new HashMap<>();
        for(Score s : scoreList){
            if(resultMap.get(s.getStudentId()) != null){
                    Map<String, Integer> studentMap = resultMap.get(s.getStudentId());
                    for(Map.Entry<String, Integer> entry : studentMap.entrySet()){
                        if(s.getSubject().equals(entry.getKey()) && s.getScore() > entry.getValue()){
                           resultMap.put(s.getStudentId(), (Map<String, Integer>) new HashMap<>().put(s.getSubject(), s.getScore()));
                        }
                    }
            } else {
                resultMap.put(s.getStudentId(), (Map<String, Integer>) new HashMap<>().put(s.getSubject(), s.getScore()));
            }
        }
        System.out.println(resultMap);

    }

}