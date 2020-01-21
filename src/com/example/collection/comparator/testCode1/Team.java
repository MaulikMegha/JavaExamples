package com.example.collection.comparator.testCode1;

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

    public boolean equals(Object obj){
      if(obj != null && obj instanceof Team){
         if(this.name.equalsIgnoreCase(((Team) obj).name)){
             return true;
         }
      }

     return false;
    }

    public int hashCode(){
        return this.name.hashCode();
    }

    public String toString(){
        return this.getName() +" : "+this.getScore();
    }

}