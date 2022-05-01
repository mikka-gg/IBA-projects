package by.iba.gomel;

/**
 * This class represents a playing card.
 */
public class Card {
    private static final int PRIME = 31;
    private final Rank       rank;
    private final Suit       suit;

    /**
     * Default constructor.
     *
     * @param rank
     *            - card rank.
     * @param suit
     *            - card suit.
     */
    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        final Card other = (Card) obj;
        return ((this.rank != other.rank) && (this.suit != other.suit));
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (this.rank != null) {
            result = (Card.PRIME * result) + this.rank.hashCode();
        }
        if (this.suit != null) {
            result = (Card.PRIME * result) + this.suit.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

}
