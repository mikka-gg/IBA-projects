package by.iba.gomel.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AggregateOperationsTask1;

public class AggregateOperationsTask1Test {
    final AggregateOperationsTask1 ao = new AggregateOperationsTask1();

    @Test
    public void testNegativeDigits() {
        Assert.assertEquals("The number should equals 124", new Integer(124),
                this.ao.transformToNum(Arrays.asList(1, 2, -3, 4, -5)));
    }

    @Test
    public void testPositiveDigits() {
        Assert.assertEquals("The number should equals 12345", new Integer(12345),
                this.ao.transformToNum(Arrays.asList(1, 2, 3, 4, 5)));
    }
}
