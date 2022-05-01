package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.SumOfIntegers;

public class SumOfIntegersTest {

    @Test
    public void testSumInt() {
        Assert.assertEquals("Should return a sum of 6", 6, new SumOfIntegers().sumInt(3));
        try {
            Assert.assertEquals("Should return 0 or error", 0, new SumOfIntegers().sumInt(-3));
        } catch (final AssertionError e) {
            Assert.assertEquals("Negative number -3", "Negative number -3", e.getMessage());
        }
    }

}
