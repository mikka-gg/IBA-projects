package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WordsFinderInBrackets;

/**
 * Tests the WordsFinderInBrackets class by creating a object wf of type WordsFinderInBrackets and
 * using the testFindWords() method checks, if the findWords() method works correct.
 */
public class WordsFinderInBracketsTest {
    WordsFinderInBrackets wf = new WordsFinderInBrackets();

    /**
     * Using the wf object of type WordsFinderInBrackets and the assertEquals() methods checks if
     * the findWords() method returns correct values by passing to it some sequences.
     */
    @Test
    public void testFindWords() {
        Assert.assertEquals("Should return correct answer", "word2 (word3) word4; word3; ",
                this.wf.findWords("word1 {word2 (word3) word4} word5"));
        Assert.assertEquals("Should return correct answer",
                "word1 word2 [word3} word4 word5; word3; ",
                this.wf.findWords("[word1 word2 [word3} word4 word5)"));
        Assert.assertEquals("Should return correct answer",
                "word1 (word2 word3} word4 word5; word2 word3; ",
                this.wf.findWords("[word1 (word2 word3} word4 word5)"));
        Assert.assertEquals("Should return an empty String", "",
                this.wf.findWords("word1 word2 word3 word4 word5"));
    }

}
