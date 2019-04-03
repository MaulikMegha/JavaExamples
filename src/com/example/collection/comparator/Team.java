package com.example.collection.comparator;

public class Team {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public String toString(){
        return this.getName() +" : "+this.getScore();
    }
}