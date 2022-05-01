package by.iba.gomel;

/**
 * This class creates an array of Card Objects. It consists of all playing cards(52 cards). When
 * need to get a card from an array of Card Objects, "getCardFromDeck" searches for the right card
 * and and return it as String.
 */
public class DeckOfCards {

    public static final int NUMBER_OF_SUITS = 4;
    public static final int NUMBER_OF_RANKS = 13;

    /**
     * This constructor fills an array of Card Objects with cards from "Card" class.
     */
    public DeckOfCards() {
        final Card[][] cards = new Card[DeckOfCards.NUMBER_OF_SUITS][DeckOfCards.NUMBER_OF_RANKS];
        for (int suit = 1; suit <= DeckOfCards.NUMBER_OF_SUITS; suit++) {
            for (int rank = 1; rank <= DeckOfCards.NUMBER_OF_RANKS; rank++) {
                cards[suit - 1][rank - 1] = new Card(rank, suit);
            }
        }
    }

    /**
     * This method takes a card and searches for the card in the array"cards". If it finds - returns
     * this card as a String.
     *
     * @param searchedCard
     *            - an Object which consists of rank [1 to 13 (from "Ace" to "King")] and suit [1 to
     *            4 ("Clubs", "Diamonds", "Hearts", "Spades")].
     * @return a String definition of a card Object.
     */
    public String getCardFromDeck(final Card searchedCard) {
        String cardReturn = null;
        for (int suit = 1; suit <= DeckOfCards.NUMBER_OF_SUITS; suit++) {
            for (int rank = 1; rank <= DeckOfCards.NUMBER_OF_RANKS; rank++) {
                final Card getCard = new Card(rank, suit);
                if (getCard.comparingCards(searchedCard)) {
                    cardReturn = getCard.getStringCard();
                }
            }
        }
        return cardReturn;
    }

}
