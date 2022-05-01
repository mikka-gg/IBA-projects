package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Card;
import by.iba.gomel.DeckOfCards;
import by.iba.gomel.Rank;
import by.iba.gomel.Suit;

public class DeckOfCardsTest {

    @Test
    public void testGetCard() {
        final DeckOfCards doc = new DeckOfCards();
        Assert.assertEquals("Shoud return the ACE of DIAMONDS card", "ACE of DIAMONDS",
                doc.getCard(new Card(Rank.ACE, Suit.DIAMONDS)));
        Assert.assertEquals("Shoud return the FOUR of HEARTS card", "FOUR of HEARTS",
                doc.getCard(new Card(Rank.FOUR, Suit.HEARTS)));
    }

}
