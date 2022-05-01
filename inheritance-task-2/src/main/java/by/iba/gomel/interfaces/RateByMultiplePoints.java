package by.iba.gomel.interfaces;

/**
 * Sets playerId and using any algorithm player's score.
 */
public interface RateByMultiplePoints {
    /**
     * Sets playerId, and using the array of points somehow sets player's score.
     *
     * @param playerId
     *            - an integer variable, player's ID.
     * @param points
     *            - an array of double, sequence of points of the player.
     */
    void ratePlayer(int playerId, double[] points);
}
