package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.InitialsFromFullName;

/**
 * Tests the computeInitials() method of the InitialsFromFullName class. Sends various full names ,
 * and tests if returned initials are correct.
 */
public class InitialsFromFullNameTest {

    /**
     * Sends various full names, and tests if returned initials are correct.
     */
    @Test
    public void testComputeInitials() {
        final InitialsFromFullName initials = new InitialsFromFullName();

        // Correct full names
        Assert.assertEquals("Should return 'J.B.'", "J.B.", initials.computeInitials("Jonh Brown"));
        Assert.assertEquals("Should return 'A.S.'", "A.S.",
                initials.computeInitials("Adam Sendler"));
        // Incorrect full names
        Assert.assertEquals("Should return an empty String", "",
                initials.computeInitials("jonh brown"));
        Assert.assertEquals("Should return an empty String", "",
                initials.computeInitials("Jonh brown"));
        Assert.assertEquals("Should return an empty String", "",
                initials.computeInitials("jonh Brown"));
        Assert.assertEquals("Should return an empty String", "",
                initials.computeInitials("JonhBrown"));
        Assert.assertEquals("Should return an empty String", "",
                initials.computeInitials("Jonh JBrown"));

    }

}
