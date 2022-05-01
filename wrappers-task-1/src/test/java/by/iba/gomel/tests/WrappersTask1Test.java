package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.WrappersTask1;

/**
 * Tests the floatPointSum() method of the WrappersTask1 class.
 */
public class WrappersTask1Test {
    private static final Logger LOG = LoggerFactory.getLogger(WrappersTask1Test.class);

    /**
     * Using an instance of the WrappersTask1 class tests the floatPointSum() method by sending an
     * array of numbers. Catches IllegalArgumentException, if zero or one argument is passed.
     */
    @Test
    public void testFloatPointSum() {
        final WrappersTask1 wt = new WrappersTask1();
        try {
            Assert.assertEquals("Should be 108.75", "108.75",
                    wt.floatPointSum(new double[] {1, 1e2, 3.0, 4.754}));
        } catch (final IllegalArgumentException e) {
            WrappersTask1Test.LOG.error(e.getMessage(), e);
        }
        try {
            Assert.assertEquals("Should be IllegalArgumentException", "",
                    wt.floatPointSum(new double[] {1}));

        } catch (final IllegalArgumentException e) {
            WrappersTask1Test.LOG.error(e.getMessage(), e);
        }
        try {
            Assert.assertEquals("Should be IllegalArgumentException", "",
                    wt.floatPointSum(new double[] {}));

        } catch (final IllegalArgumentException e) {
            WrappersTask1Test.LOG.error(e.getMessage(), e);
        }

    }

}
