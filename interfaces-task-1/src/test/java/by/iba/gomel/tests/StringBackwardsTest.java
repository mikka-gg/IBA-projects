package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.StringBackwards;

/**
 * Test for 'StringBackwards' class.
 */
public class StringBackwardsTest {

    /**
     * Creates an object and checks if 'reversingString' method returning correctly reversed text.
     */
    @Test
    public void testReversingString() {
        final StringBackwards string = new StringBackwards();

        Assert.assertEquals("Should return a reversed text", "dedeen ton si ecneuqeSbus kniht I",
                string.reversingString("I think subSequence is not needed"));
    }

}
