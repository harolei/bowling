package com.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Round> roundList;
    private int roundNumber;
    private int totalScoreByRoundNumber;

    public Game() {
        this.roundList = new ArrayList<Round>();
    }

    public void addRound(Round round) {
      this.roundList.add(round);
      this.roundNumber++;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }

    public int getTotalScoreByRoundNumber(int roundNumber) {
        this.totalScoreByRoundNumber = 0;
        for(int i=0;i<roundNumber;i++){
            totalScoreByRoundNumber += roundList.get(i).getScore();
            if(roundList.get(i).getScore()==10){
               totalScoreByRoundNumber += roundList.get(i+1).getFirstHit();
            }
        }
        return this.totalScoreByRoundNumber;
    }
}
