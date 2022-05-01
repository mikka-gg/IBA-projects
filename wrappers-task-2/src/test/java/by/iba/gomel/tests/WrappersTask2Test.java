package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WrappersTask2;

/**
 * Tests the WrappersTask2 class by sending to the calcExpression() method x and y.
 */
public class WrappersTask2Test {

    /**
     * Sends x and y to the calcExpression() method and expects appropriate return.
     */
    @Test
    public void testCalcExpression() {
        final WrappersTask2 wt = new WrappersTask2();
        Assert.assertEquals("Should return 1.194", new Double(1.194), wt.calcExpression(0.4, 0.8));
        Assert.assertEquals("Should return 1.344", new Double(1.344), wt.calcExpression(0.1, 0.0));
        Assert.assertEquals("Should return 0.684", new Double(0.684),
                wt.calcExpression(-0.7, 0.67));
    }

}
