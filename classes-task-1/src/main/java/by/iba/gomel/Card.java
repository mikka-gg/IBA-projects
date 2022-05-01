package by.iba.gomel;

/**
 * This class contains ranks and suits of playing cards(52 cards).
 *
 * Also this class can compare cards and convert an array of Card Objects to String.
 */
public class Card {

    private final int rank;
    private final int suit;

    /**
     * This is a constructor of "Card" class. Takes rank and suit of playing card.
     *
     * @param rank
     *            - an integer variable from 1 to 13(from "Ace" to "King").
     * @param suit
     *            - an integer variable from 1 to 4("Clubs", "Diamonds", "Hearts", "Spades").
     */
    public Card(final int rank, final int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * This method takes a card and compares its rank and suit, if rank and suit are the same -
     * returns true.
     *
     * @param searchedCard
     *            - an Object which consists of rank [1 to 13(from "Ace" to "King")] and suit [1 to
     *            4("Clubs", "Diamonds", "Hearts", "Spades")].
     * @return TRUE - rank and suit are the same as in the "searchedCard". FALSE - rank or suit
     *         differs from the "searchedCard" rank and suit.
     */
    public boolean comparingCards(final Card searchedCard) {
        boolean rankEquals = false;
        boolean suitEquals = false;
        if (this.rank == searchedCard.rank) {
            rankEquals = true;
        }
        if (this.suit == searchedCard.suit) {
            suitEquals = true;
        }
        return rankEquals && suitEquals;
    }

    /**
     * This method converts Objects rank and suit to String.
     *
     * @return String rank and suit of card.
     */
    public String getStringCard() {
        final String[] cardRanks = {null, "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        final String[] cardSuits = {null, "Clubs", "Diamonds", "Hearts", "Spades"};
        return cardRanks[this.rank] + " of " + cardSuits[this.suit];
    }

}
