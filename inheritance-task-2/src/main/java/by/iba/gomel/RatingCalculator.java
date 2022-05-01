package by.iba.gomel;

/**
 * This class stores participant's score and ID and scores of the all participants. First created
 * Object of this class should be whoever is judging, with a number of participants. Then the
 * participants should be added to the array scores using the addPlayer() method. After all players
 * are added, the rateByScore() method should be called, that sorts participants by their
 * scores(from a winner to a loser). To get the array with final placements the getScores() method
 * is used.
 */
public class RatingCalculator {
    private final int     numberOfParticipants;
    private final Score[] scores;
    private int           playersCount;
    private int           participantScore;
    private int           participantId;

    /**
     * If number of participants in the competition is not determined, sets to the default value of
     * zero and creates an array with the number of participants. Participant's score and ID is set
     * to -1 by default.
     */
    public RatingCalculator() {
        this.numberOfParticipants = 0;
        this.scores = new Score[this.numberOfParticipants];
        this.playersCount = 0;
        this.participantScore = -1;
        this.participantId = -1;
    }

    /**
     * Takes a number of participants and creates a new array of scores using it. Sets players count
     * to zero.
     *
     * @param numberOfParticipants
     *            - an integer value, the number of participants in the competition.
     */
    public RatingCalculator(final int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
        this.playersCount = 0;
        this.scores = new Score[this.numberOfParticipants];
    }

    /**
     * The addPlayer() method takes an Object of type RatingCalculator. It checks if the array is
     * not full, if true - creates an Object of type Score, adds it to the array, sets fields of the
     * object with the fields of parameter and increases the counter of the participants.
     *
     * @param participant
     *            - an Object of type RatingCalculator, a player.
     */
    public void addPlayer(final RatingCalculator participant) {
        if (this.playersCount < this.numberOfParticipants) {
            this.scores[this.playersCount] = new Score();
            this.scores[this.playersCount].setPlayerId(participant.getParticipantId());
            this.scores[this.playersCount].setPlayerScore(participant.getParticipantScore());
            this.playersCount++;
        }
    }

    public int getParticipantId() {
        return this.participantId;
    }

    public int getParticipantScore() {
        return this.participantScore;
    }

    public Score[] getScores() {
        return this.scores.clone();
    }

    /**
     * This method should be called, when the array of the players is full and the judge needs to
     * sort the players by their score.
     */
    public void rateByScore() {
        Score temp = null;
        for (int i = 0; i < this.scores.length; i++) {
            for (int j = i + 1; j < this.scores.length; j++) {
                if (this.scores[i].getPlayerScore() < this.scores[j].getPlayerScore()) {
                    temp = this.scores[i];
                    this.scores[i] = this.scores[j];
                    this.scores[j] = temp;
                }
            }
        }
    }

    public void setParticipantId(final int playerId) {
        this.participantId = playerId;
    }

    public void setParticipantScore(final int playerScore) {
        this.participantScore = playerScore;
    }
}
