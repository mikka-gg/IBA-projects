package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.VariablesPractice;

public class VariablesPracticeTest {

    /**
     * testReturnsBoolean
     */
    @Test
    public void testReturnsBoolean() {
        Assert.assertFalse("Should return a value", VariablesPractice.returnsBoolean());
    }

    /**
     * testReturnsByte
     */
    @Test
    public void testReturnsByte() {
        Assert.assertEquals("Should return a value", 127, VariablesPractice.returnsByte());
    }

    /**
     * testReturnsChar
     */
    @Test
    public void testReturnsChar() {
        Assert.assertEquals("Should return a value", 'P', VariablesPractice.returnsChar());
    }

    /**
     * testReturnsDouble
     */
    @Test
    public void testReturnsDouble() {
        Assert.assertEquals("Should return a value", 301.210, VariablesPractice.returnsDouble(), 0);
    }

    /**
     * testReturnsFloatFinal
     */
    @Test
    public void testReturnsFloatFinal() {
        Assert.assertEquals("Should return a value", 30.210F, VariablesPractice.returnsFloatFinal(),
                0);
    }

    /**
     * testReturnsInt
     */
    @Test
    public void testReturnsInt() {
        Assert.assertEquals("Should return a value", 0, VariablesPractice.returnsInt());
    }

    /**
     * testReturnsIntFinal
     */
    @Test
    public void testReturnsIntFinal() {
        Assert.assertEquals("Should return a value", 83647, VariablesPractice.returnsIntFinal());
    }

    /**
     * testReturnsLong
     */
    @Test
    public void testReturnsLong() {
        Assert.assertEquals("Should return a value", 941_230_854_775_807L,
                VariablesPractice.returnsLong());
    }

    /**
     * testReturnsString
     */
    @Test
    public void testReturnsString() {
        Assert.assertEquals("Should return a value", "String Variable",
                VariablesPractice.returnsString());
    }
}
