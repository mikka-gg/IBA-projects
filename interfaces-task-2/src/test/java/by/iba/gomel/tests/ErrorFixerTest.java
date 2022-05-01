package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ErrorFixer;

/**
 * Testing 'ErrorFixer' class.
 */
public class ErrorFixerTest {
    ErrorFixer test = new ErrorFixer();

    /**
     * This test method invokes test() method of ErrorFixer class. Expects overrided value.
     */
    @Test
    public void testTest() {
        Assert.assertEquals("Should return 3", 3, this.test.test());
    }

    /**
     * This test method invokes testDefault() method of ErrorFixer class. Expects overrided value.
     */
    @Test
    public void testTestDefault() {
        Assert.assertEquals("Should return 4", 4, this.test.testDefault());
    }

    /**
     * This test method invokes testStaticA() method of ErrorFixer class. Expects original value.
     */
    @Test
    public void testTestStaticA() {
        Assert.assertEquals("Should return 1", 1, this.test.testStaticA());
    }

    /**
     * This test method invokes testStaticB() method of ErrorFixer class. Expects original value.
     */
    @Test
    public void testTestStaticB() {
        Assert.assertEquals("Should return 2", 2, this.test.testStaticB());
    }
}
