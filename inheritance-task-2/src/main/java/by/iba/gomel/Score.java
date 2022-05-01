package by.iba.gomel;

/**
 * This class stores and provides access to the player's score and ID.
 */
public class Score {
    private int playerScore;
    private int playerId;

    /**
     * Constructor sets to the default values, if no implementation detected. The values -1 means a
     * player doesn't exist.
     */
    public Score() {
        this.playerId = -1;
        this.playerScore = -1;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void setPlayerId(final int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerScore(final int score) {
        this.playerScore = score;
    }

}
