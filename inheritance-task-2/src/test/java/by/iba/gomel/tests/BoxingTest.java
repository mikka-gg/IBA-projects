package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForBoxing;
import by.iba.gomel.RatingCalculator;

/**
 * This test class is a referee for boxing tournaments. It has a boxer Object of type
 * CalculatorForBoxing, judge object of type RatingCalculator and an integer array with final
 * placements of the boxers
 */
public class BoxingTest {
    private CalculatorForBoxing boxer;
    private RatingCalculator    judge;
    private int[]               placements;

    /**
     * A test method to judge a boxing tournament.
     *
     * The judge object creates a new object with 4 boxers. Then step by step a new boxer object is
     * created and some actions are executed using the methods of the CalculatorForBoxing class and
     * after that the judge adds the player to the array. When all the boxers are added, the judge
     * object should invoke the rateByScore() method to sort the boxers' scores. The sorted ID's
     * then are copied to the placements array and the assertArrayEquals() method checks if the
     * order is right.
     */
    @Test
    public void testRateBoxing() {
        this.judge = new RatingCalculator(4);
        // First boxer
        this.boxer = new CalculatorForBoxing();
        this.boxer.addPoints(777, 10);
        this.boxer.addPoints(777, 7);
        this.boxer.addPoints(777, 3);
        this.boxer.knockout(777);
        this.judge.addPlayer(this.boxer);
        // Second boxer
        this.boxer = new CalculatorForBoxing();
        this.boxer.addPoints(310, 10);
        this.boxer.knockout(310);
        this.judge.addPlayer(this.boxer);
        // Third boxer
        this.boxer = new CalculatorForBoxing();
        this.boxer.addPoints(13, 10);
        this.boxer.knockout(13);
        this.boxer.disqualify(13);
        this.judge.addPlayer(this.boxer);
        // Forth boxer
        this.boxer = new CalculatorForBoxing();
        this.boxer.disqualify(41);
        this.judge.addPlayer(this.boxer);

        this.judge.rateByScore();

        this.placements = new int[this.judge.getScores().length];
        for (int i = 0; i < this.judge.getScores().length; i++) {
            this.placements[i] = this.judge.getScores()[i].getPlayerId();
        }

        Assert.assertArrayEquals("The right order of IDs is (777, 310, 13, 41)",
                new int[] {777, 310, 13, 41}, this.placements);
    }

}
