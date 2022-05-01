package by.iba.gomel;

import by.iba.gomel.interfaces.Disqualification;
import by.iba.gomel.interfaces.RateByResult;

/**
 * Main rule = wins whoever has the best running result. Runners who didn't start or exceeded the
 * maximum time(50.0 minutes) are disqualified.
 */
public class CalculatorForRunning extends RatingCalculator
        implements Disqualification, RateByResult {
    private static final int    DISQUALIFIED_SCORE = -50000;
    private static final double MIN_RESULT         = 0;
    private static final double MAX_RESULT         = 50.0;
    private static final int    NUMBER_ONE         = 1;
    private static final int    NUMBER_TWO         = 1000;

    /**
     * Sets player's ID and sets his score to -50000, so he is the last in the score list.
     */
    @Override
    public void disqualify(final int playerId) {
        this.setParticipantId(playerId);
        this.setParticipantScore(CalculatorForRunning.DISQUALIFIED_SCORE);
    }

    /**
     * If runner started and didn't exceed the maximum time, sets his ID and score, otherwise he is
     * disqualified.
     */
    @Override
    public void setPlayerResult(final int playerId, final double result) {

        if ((result > CalculatorForRunning.MIN_RESULT)
                && (result < CalculatorForRunning.MAX_RESULT)) {
            this.setParticipantId(playerId);
            /**
             * 1 - (result * 1000)). The way I store ID's of players(from winner to loser) doesn't
             * work here, because runner with the worst result will win. So I compare their scores
             * in negative integer (i.e. results are 5.312 and 5.313 -> -5311 is higher than -5312,
             * so 5.312 wins).
             */
            this.setParticipantScore((int) (CalculatorForRunning.NUMBER_ONE
                    - (result * CalculatorForRunning.NUMBER_TWO)));
        } else {
            this.disqualify(playerId);
        }
    }

}
