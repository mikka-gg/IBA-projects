package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Card;
import by.iba.gomel.DeckOfCards;

/**
 * This test class contains Objects(playing cards) and a test method "testCard", which sends Objects
 * to "DeckOfCards" class and expects a card name in return.
 */
public class CardTest {
    DeckOfCards deck          = new DeckOfCards();

    // Playing cards
    Card        aceOfClubs    = new Card(1, 1);
    Card        aceOfDiamonds = new Card(1, 2);
    Card        jackOfClubs   = new Card(11, 1);
    Card        kingOfSpades  = new Card(13, 4);

    /**
     * This test method sends an Object(playing card) and expects its name in return.
     */
    @Test
    public void testCard() {
        Assert.assertEquals("Should return Ace of Clubs", "Ace of Clubs",
                this.deck.getCardFromDeck(this.aceOfClubs));
        Assert.assertEquals("Should return Ace of Diamonds", "Ace of Diamonds",
                this.deck.getCardFromDeck(this.aceOfDiamonds));
        Assert.assertEquals("Should return Jack of Clubs", "Jack of Clubs",
                this.deck.getCardFromDeck(this.jackOfClubs));
        Assert.assertEquals("Should return King of Spades", "King of Spades",
                this.deck.getCardFromDeck(this.kingOfSpades));
    }
}
