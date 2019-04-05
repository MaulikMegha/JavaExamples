package com.example.interview.priceline;

import java.util.List;
import java.util.Random;

import static com.example.interview.priceline.ChutesLadderBoard.chutesMap;
import static com.example.interview.priceline.ChutesLadderBoard.ladderMap;
import static com.example.interview.priceline.ChutesLadderBoard.winingScore;

public class ChutesLadder {

    public void startGame(List<Player> playerList){
        do {
            int playerCount = playerList.size();
            for(int i = 0; i < playerCount; i++){
                Player player = playerList.get(i);
                System.out.print(player.getName()+": " + player.getScore() + " --> ");
                player.setScore(playerScore(player.getScore(), rollDice()));
            }
        } while (isContinueGame(playerList));
    }

    protected boolean isContinueGame(List<Player> playerList){
        int playerCount = playerList.size();
        for(int i = 0; i < playerCount; i++){
            Player player = playerList.get(i);
            if(player.getScore() >= winingScore){
                System.out.println("The winner is "+player.getName());
                return false;
            }
        }
        return true;
    }

    protected int rollDice(){
        Random random = new Random();
        int diceOne = random.nextInt(6) + 1;
        int diceTwo = random.nextInt(6) + 1;
        int result = diceOne + diceTwo;

        return result;
    }

    protected int playerScore(int previousScore, int diceValue){
        int currentScore = previousScore + diceValue;
        System.out.print(currentScore);

        if(chutesMap.get(currentScore)!= null){
            currentScore = chutesMap.get(currentScore);
            System.out.print(" --CHUTE--> "+currentScore);
        } else if (ladderMap.get(currentScore)!= null){
            currentScore = ladderMap.get(currentScore);
            System.out.print(" --LADDER--> "+currentScore);
        }
        System.out.println("");

        return currentScore;
    }

}

