package by.iba.gomel.interfaces;

/**
 * This interface rates a player by this result.
 */
public interface RateByResult {
    /**
     * Sets player's ID and points.
     *
     * @param playerId
     *            - an integer variable, player's ID.
     *
     * @param result
     *            - an integer variable, player's result.
     */
    void setPlayerResult(int playerId, double result);
}
