package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForRunning;
import by.iba.gomel.RatingCalculator;

/**
 * This test class is a referee for running tournaments. It has a runner Object of type
 * CalculatorForFigureScating, judge object of type RatingCalculator and an integer array with final
 * placements of the runners.
 */
public class RunningTest {
    private RatingCalculator     judge;
    private CalculatorForRunning runner;
    private int[]                placements;

    /**
     * A test method to judge a running tournament.
     *
     * The judge object creates a new object with 4 runners. Then step by step a new runner object
     * is created and some actions are executed using the methods of the CalculatorForRunning class
     * and after that the judge adds the player to the array. When all the runners are added, the
     * judge object should invoke the rateByScore() method to sort the runners' scores. The sorted
     * ID's then are copied to the placements array and the assertArrayEquals() method checks if the
     * order is right.
     */
    @Test
    public void testRateRunning() {
        this.judge = new RatingCalculator(4);
        // First runner
        this.runner = new CalculatorForRunning();
        this.runner.disqualify(431);
        this.judge.addPlayer(this.runner);
        // Second runner
        this.runner = new CalculatorForRunning();
        this.runner.setPlayerResult(912, 5.312);
        this.judge.addPlayer(this.runner);
        // Third runner
        this.runner = new CalculatorForRunning();
        this.runner.setPlayerResult(21, 5.311);
        this.judge.addPlayer(this.runner);
        // Forth runner
        this.runner = new CalculatorForRunning();
        this.runner.setPlayerResult(341, 5.290);
        this.judge.addPlayer(this.runner);

        this.judge.rateByScore();

        this.placements = new int[this.judge.getScores().length];
        for (int i = 0; i < this.judge.getScores().length; i++) {
            this.placements[i] = this.judge.getScores()[i].getPlayerId();
        }

        Assert.assertArrayEquals("The right order of IDs is (341, 21, 912, 431)",
                new int[] {341, 21, 912, 431}, this.placements);
    }
}
