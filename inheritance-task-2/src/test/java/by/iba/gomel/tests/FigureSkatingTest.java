package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForFigureScating;
import by.iba.gomel.RatingCalculator;

/**
 * This test class is a referee for figure skating tournaments. It has a skater Object of type
 * CalculatorForFigureScating, judge object of type RatingCalculator and an integer array with final
 * placements of the skaters.
 */
public class FigureSkatingTest {
    private CalculatorForFigureScating skater;
    private RatingCalculator           judge;
    private int[]                      placements;

    /**
     * A test method to judge a figure skating tournament.
     *
     * The judge object creates a new object with 4 skaters. Then step by step a new skater object
     * is created and some actions are executed using the methods of the CalculatorForFigureScating
     * class and after that the judge adds the player to the array. When all the skaters are added,
     * the judge object should invoke the rateByScore() method to sort the skaters' scores. The
     * sorted ID's then are copied to the placements array and the assertArrayEquals() method checks
     * if the order is right.
     */
    @Test
    public void testRateFigureSkating() {
        this.judge = new RatingCalculator(4);
        // First skater
        this.skater = new CalculatorForFigureScating();
        this.skater.ratePlayer(123, new double[] {5, 10});
        this.judge.addPlayer(this.skater);
        // Second skater
        this.skater = new CalculatorForFigureScating();
        this.skater.ratePlayer(341, new double[] {10, 10});
        this.judge.addPlayer(this.skater);
        // Third skater
        this.skater = new CalculatorForFigureScating();
        this.skater.ratePlayer(31, new double[] {10, 10, 31});
        this.judge.addPlayer(this.skater);
        // Fourth skater
        this.skater = new CalculatorForFigureScating();
        this.skater.disqualify(51);
        this.judge.addPlayer(this.skater);

        this.judge.rateByScore();

        this.placements = new int[this.judge.getScores().length];
        for (int i = 0; i < this.judge.getScores().length; i++) {
            this.placements[i] = this.judge.getScores()[i].getPlayerId();
        }

        Assert.assertArrayEquals("The right order of IDs is (31, 341, 123, 51)",
                new int[] {31, 341, 123, 51}, this.placements);
    }

}
