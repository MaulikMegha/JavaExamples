package com.example.collection.comparable.testCode2;

public class Team implements Comparable<Team>{

    private String name;
    private int rank;

    public Team(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return getName()+" : "+getRank();
    }


    @Override
    public int compareTo(Team o) {
        if(this.rank < o.getRank()){
            return 1;
        } else if(this.rank > o.getRank()){
            return -1;
        }
        return 0;
    }
}
