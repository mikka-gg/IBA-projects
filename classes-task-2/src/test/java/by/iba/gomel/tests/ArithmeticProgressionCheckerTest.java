package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArithmeticProgressionChecker;

/**
 * Test class for 'ArithmeticProgressionChecker' class. Has an object and a method, which checks if
 * 'checker' returns a valid value.
 */
public class ArithmeticProgressionCheckerTest {
    ArithmeticProgressionChecker testAP = new ArithmeticProgressionChecker();

    /**
     * This method sends to 'checker' method a arbitrary number of integer arguments and checks if
     * the method returns a valid values.
     */
    @Test
    public void testChecker() {
        // Arithmetic progression
        Assert.assertTrue("Should return true(AP)", this.testAP.checker(1, 3, 5, 7, 9));
        Assert.assertTrue("Should return true(AP)", this.testAP.checker(-1, -3, -5, -7, -9));
        Assert.assertTrue("Should return true(AP)", this.testAP.checker(-1, 0));
        // Not arithmetic progression
        Assert.assertFalse("Should return false(not AP)", this.testAP.checker(1, 3, 5, 7, 10));
        Assert.assertFalse("Should return false(not AP)", this.testAP.checker(-1, 0, 1, 3, 5));
        Assert.assertFalse("Should return false(not AP)", this.testAP.checker(0, 0, 1, 2, 3));
        Assert.assertFalse("Should return false(not AP)", this.testAP.checker(1));
        Assert.assertFalse("Should return false(not AP)", this.testAP.checker());
    }

}
