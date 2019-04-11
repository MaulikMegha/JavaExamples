package com.example.interview.priceline.chutesLadder;

import java.util.List;
import java.util.Random;

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
            if(player.getScore() >= ChutesLadderBoard.winingScore){
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

        if(ChutesLadderBoard.chutesMap.get(currentScore)!= null){
            currentScore = ChutesLadderBoard.chutesMap.get(currentScore);
            System.out.print(" --CHUTE--> "+currentScore);
        } else if (ChutesLadderBoard.ladderMap.get(currentScore)!= null){
            currentScore = ChutesLadderBoard.ladderMap.get(currentScore);
            System.out.print(" --LADDER--> "+currentScore);
        }
        System.out.println("");

        return currentScore;
    }

}

