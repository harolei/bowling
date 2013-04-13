package com.bowling;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoundTest {

    private Game game;
    private Map scoreData;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        scoreData = new HashMap<Integer, ArrayList<Integer>>();
        initScoreData();
    }

    private void initScoreData() {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(4);
        scoreData.put(1, data);

        data.clear();
        data.add(4);
        data.add(5);
        scoreData.put(2, data);

        data.clear();
        data.add(6);
        data.add(4);
        scoreData.put(3, data);

        data.clear();
        data.add(5);
        data.add(5);
        scoreData.put(4, data);

        data.clear();
        data.add(10);
        scoreData.put(5, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(6, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(7, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(8, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(1, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(1, data);

        data.clear();
        data.add(1);
        data.add(4);
        scoreData.put(1, data);
    }

    @Test
    public void shouldGetFivePointsWhenHit1BallFirstTimeAnd4BallSecondTime() throws Exception {
        Round round = new Round(1, 4);
        assertThat(round.getScore(),is(5));

    }

    @Test
    public void shouldGetCurrentRoundNumberCorrectly() throws Exception {
        Round round1 = new Round();
        Round round2 = new Round();
        game.addRound(round1);
        game.addRound(round2);
        assertThat(game.getRoundNumber(), is(2));
    }

    @Test
    public void shouldGetTotalScoreByRoundNumber() throws Exception {
        initGame();

        assertThat(game.getTotalScoreByRoundNumber(1), is(5));
        assertThat(game.getTotalScoreByRoundNumber(2),is(14));
        assertThat(game.getTotalScoreByRoundNumber(3),is(29));

    }

    private void initGame() {

        Round round1 = new Round(1, 4);
        Round round2 = new Round(4, 5);
        Round round3 = new Round(6, 4);
        Round round4 = new Round(5, 5);

        game.addRound(round1);
        game.addRound(round2);
        game.addRound(round3);
        game.addRound(round4);
    }
}
