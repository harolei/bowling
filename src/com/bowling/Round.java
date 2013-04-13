package com.bowling;

public class Round {

    private int firstHit;
    private int secondHit;


    public Round() {

    }

    public Round(int firstHit, int secondHit) {
        this.firstHit = firstHit;
        this.secondHit = secondHit;
    }

    public int getFirstHit() {
        return firstHit;
    }

    public int getScore() {
        return this.firstHit + this.secondHit;
    }
}
