package com.example.interview.priceline.chutesLadder;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
     final static int SCORE_ZERO=0;
    public static void main(String args[]){

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Eric", SCORE_ZERO));
        playerList.add(new Player("Paul", SCORE_ZERO));
        // we can add more player as below
        // playerList.add(new Player("Maulik", 0));

        ChutesLadder chutesLadder = new ChutesLadder();
        chutesLadder.startGame(playerList);

    }
}