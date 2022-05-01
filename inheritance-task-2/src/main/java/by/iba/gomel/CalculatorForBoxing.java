package by.iba.gomel;

import by.iba.gomel.interfaces.Disqualification;
import by.iba.gomel.interfaces.RateByAccumulatingPoints;

/**
 * Main rule = wins whoever has more points. To add points to a player use the addPoints() method,
 * it requires player's ID and how much points to add. To disqualify the player use the disqualify()
 * method, it requires player's ID, and sets player's score to zero without a chance to add points
 * to the player. The knockout() method requires player's ID, it adds 1 point and should be used
 * every time the player get point for a knockout.
 */
public class CalculatorForBoxing extends RatingCalculator
        implements Disqualification, RateByAccumulatingPoints {

    /**
     * At the first invocation sets the player's ID and points, afterwards adds only new points to
     * the existing ones.
     */
    @Override
    public void addPoints(final int playerId, final int points) {
        if (this.getParticipantId() == -1) {
            this.setParticipantId(playerId);
            this.setParticipantScore(points);
        } else if (this.getParticipantId() != -1) {
            int temp = 0;
            temp += this.getParticipantId();
            temp += points;
            this.setParticipantScore(temp);
        }
    }

    /**
     * At the first invocation sets the player's score to zero and sets player's ID, if player
     * exists only sets his score to zero.
     */
    @Override
    public void disqualify(final int playerId) {
        if (this.getParticipantId() == -1) {
            this.setParticipantId(playerId);
            this.setParticipantScore(0);
        } else if (this.getParticipantId() != -1) {
            this.setParticipantScore(0);
        }
    }

    /**
     * At the first invocation sets player's ID and adds 1 point, each next call adds 1 point to the
     * score.
     */
    @Override
    public void knockout(final int playerId) {
        if (this.getParticipantId() == -1) {
            this.setParticipantId(playerId);
            this.setParticipantScore(1);
        } else if (this.getParticipantId() != -1) {
            int temp = 0;
            temp += this.getParticipantId();
            temp++;
            this.setParticipantScore(temp);
        }
    }

}
