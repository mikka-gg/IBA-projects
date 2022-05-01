package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WrappersTask3;

/**
 * Tests the WrapperTask3 class.
 */
public class WrappersTask3Test {

    /**
     * Tests the static numToDifNotations() method by sending it different numbers and expects its
     * decimal, binary, octal and hex notations.
     */
    @Test
    public void testNumToDifNotations() {
        Assert.assertEquals("Should return 31 11111 37 1f", "31 11111 37 1f",
                WrappersTask3.numToDifNotations(31));
        Assert.assertEquals("Should return an empty String", "",
                WrappersTask3.numToDifNotations(0));
        Assert.assertEquals("Should return 1 1 1 1", "1 1 1 1",
                WrappersTask3.numToDifNotations((byte) 1));
    }

}
