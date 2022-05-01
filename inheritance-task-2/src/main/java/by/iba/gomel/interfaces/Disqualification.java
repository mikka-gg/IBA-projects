package by.iba.gomel.interfaces;

/**
 * Disqualification of the player from the competition.
 */
public interface Disqualification {
    /**
     * Sets playerId, player's score is set to zero;
     *
     * @param playerId
     *            - an integer variable, player's ID
     */
    void disqualify(int playerId);
}
