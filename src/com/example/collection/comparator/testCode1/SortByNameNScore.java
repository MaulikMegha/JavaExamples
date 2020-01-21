package com.example.collection.comparator.testCode1;

import java.util.Comparator;

public class SortByNameNScore implements Comparator<Team> {

    @Override
    public int compare(Team teamA, Team teamB){
        int result = teamA.getName().compareTo(teamB.getName());
        if(result == 0){
            if( teamA.getScore() < teamB.getScore()){
                return 1;
            } else if( teamA.getScore() > teamB.getScore()){
                return -1;
            }
            return 0;
        } else {
            return result;
        }
    }

}