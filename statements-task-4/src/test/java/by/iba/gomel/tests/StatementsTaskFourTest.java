package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.StatementsTaskFour;

/**
 * "StatementsTaskFourTest" is a test for "StatementsTaskFour" class. It gives numbers to
 * "removeEvenDigits" method and checks if it returns a number without even digits
 */
public class StatementsTaskFourTest {
    StatementsTaskFour number = new StatementsTaskFour(0, 0);

    /**
     * It gives numbers to "removeEvenDigits" method and checks if it returns a number without even
     * digits
     */
    @Test
    public void testRemoveEvenDigits() {
        Assert.assertEquals("Should return a number without even digits", 135,
                this.number.removeEvenDigits(12345));
        Assert.assertEquals("Should return a number without even digits", 1,
                this.number.removeEvenDigits(106));
        Assert.assertEquals("Should return a number without even digits", 0,
                this.number.removeEvenDigits(6));
        Assert.assertEquals("Should return a number without even digits", 0,
                this.number.removeEvenDigits(0));
    }

}
