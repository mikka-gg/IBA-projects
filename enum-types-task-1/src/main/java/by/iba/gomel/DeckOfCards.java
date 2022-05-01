package by.iba.gomel;

/**
 * This class represents a deck of 52 cards. To get particular card use the getCard() method.
 */
public class DeckOfCards {
    private static final int DECK_SIZE = 52;
    private final Card[]     deck      = new Card[DeckOfCards.DECK_SIZE];

    /**
     * Default constructor, creates an array of 52 Card objects.
     */
    public DeckOfCards() {
        int cardNumber = 0;
        for (final Suit suit : Suit.values()) {
            for (final Rank rank : Rank.values()) {
                this.deck[cardNumber] = new Card(rank, suit);
                cardNumber++;
            }
        }
    }

    /**
     * Finds given card in the array if there is any.
     *
     * @param givenCard
     *            - card to search for.
     * @return the searched card.
     */
    public String getCard(final Card givenCard) {
        for (final Card deckCard : this.deck) {
            if (deckCard.equals(givenCard)) {
                return givenCard.toString();
            }
        }
        return "There is no such card.";
    }

}
