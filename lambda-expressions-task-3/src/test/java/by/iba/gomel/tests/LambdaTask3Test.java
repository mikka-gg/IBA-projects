package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.LambdaTask3;

public class LambdaTask3Test {

    @Test
    public void testCalcPow() {
        Assert.assertEquals("Should return 3.0", 3.0, new LambdaTask3().calcPow(3.0, 27.0), 0.1);
        Assert.assertEquals("Should return 2.0", 2.0, new LambdaTask3().calcPow(12.0, 144.0), 0.1);
    }

}
