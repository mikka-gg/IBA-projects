package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AnnotationsTaskTwo;

public class AnnotationsTaskTwoTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testGetConst() {
        Assert.assertEquals("Should be 2", 2, new AnnotationsTaskTwo().getConst());
        Assert.assertEquals("Should be 2", 2, AnnotationsTaskTwo.CONST);
    }

}
