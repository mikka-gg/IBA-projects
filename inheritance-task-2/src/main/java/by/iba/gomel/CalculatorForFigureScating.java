package by.iba.gomel;

import by.iba.gomel.interfaces.Disqualification;
import by.iba.gomel.interfaces.RateByMultiplePoints;

/**
 * Main rule = wins whoever has the highest sum of the scores. To set player's score the
 * ratePlayer() method is used, to disqualify a player (set his points to zero) the disqualify()
 * method is used.
 */
public class CalculatorForFigureScating extends RatingCalculator
        implements Disqualification, RateByMultiplePoints {

    @Override
    public void disqualify(final int playerId) {
        this.setParticipantId(playerId);
        this.setParticipantScore(0);
    }

    /**
     * Sets player's ID and computes the points, the result is set to the player's score.
     */
    @Override
    public void ratePlayer(final int playerId, final double[] points) {
        this.setParticipantId(playerId);
        int sumOfPoints = 0;
        for (final double point : points) {
            sumOfPoints += point;
        }
        this.setParticipantScore(sumOfPoints);
    }

}
