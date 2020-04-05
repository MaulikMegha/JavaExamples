package com.example.collection.comparable.testCode2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String args[]){

        Team team3 = new Team("st. Louis cardinals", 4);
        Team team = new Team("New york Yankees", 1);
        Team team2 = new Team("Philadelphia phillies", 3);
        Team team4 = new Team("Los Angeles Dodgers", 5);
        Team team1 = new Team("Boston red sox", 2);


        List<Team> teamList = new ArrayList<>();
        teamList.add(team);
        teamList.add(team1);
        teamList.add(team2);
        teamList.add(team3);
        teamList.add(team4);

        Collections.sort(teamList);


        // using Iterator
        System.out.println("*** using Iterator ***");
        Iterator<Team> it = teamList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(" ");

        // using for-each
        System.out.println("*** using forEach ***");
        for (Team t: teamList) {
            System.out.println(t);
        }
        System.out.println(" ");

        // java8 steam API
        System.out.println("*** using Steam ***");
        teamList.stream().forEach(System.out::println);

    }

}
