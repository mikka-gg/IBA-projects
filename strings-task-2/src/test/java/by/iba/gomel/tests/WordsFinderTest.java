package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WordsFinder;

/**
 * This test class creates an Object of type WordsFinder and using it checks if the findWords()
 * methods works correct.
 */
public class WordsFinderTest {
    private final WordsFinder wf = new WordsFinder();

    /**
     * Passes to the findWords() method a sentence and a given word. Equals either words in the
     * sentence, either an empty String.
     */
    @Test
    public void testFindWords() {
        Assert.assertEquals("Should return ' is his'", " is his", this.wf
                .findWords("Wealth is not his that has it, but his who enjoys it.", "history"));
        Assert.assertEquals("Should return ' the'", " the",
                this.wf.findWords("A bird in the hand is worth two in the bush", " therefore"));
        Assert.assertEquals("Should return ' can'", " can", this.wf.findWords(
                "You can catch more flies with honey than you can with vinegar", " cannabis"));
        Assert.assertEquals("Should return an empty String", "", this.wf.findWords(
                "You can catch more flies with honey than you can with vinegar", " poetry"));
        Assert.assertEquals("Should return an empty String", "", this.wf
                .findWords("Wealth is not his that has it, but his who enjoys it.", "story"));
    }
}
