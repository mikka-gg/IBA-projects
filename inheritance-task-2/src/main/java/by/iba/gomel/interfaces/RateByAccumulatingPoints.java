package by.iba.gomel.interfaces;

/**
 * Interface for boxing. The addPoints() method adds points to the player, the knockout() method
 * adds points for knockouts to the player.
 */
public interface RateByAccumulatingPoints {
    /**
     * Sets player's ID and points.
     *
     * @param playerId
     *            - an integer variable, player's ID.
     *
     * @param points
     *            - an integer variable, a number of points to add.
     */
    void addPoints(int playerId, int points);

    /**
     * Adds points for knockouts;
     *
     * @param playerId
     *            - an integer variable, player's ID.
     */
    void knockout(int playerId);
}
