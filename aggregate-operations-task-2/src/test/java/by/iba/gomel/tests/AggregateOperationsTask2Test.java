package by.iba.gomel.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AggregateOperationstTask2;

public class AggregateOperationsTask2Test {
    final AggregateOperationstTask2 ao = new AggregateOperationstTask2();

    @Test
    public void testDefault() {
        Assert.assertEquals("Should be a12", "a12",
                this.ao.theLargestNumber(Arrays.asList("a12", "b10", "c")));
    }

    @Test
    public void testNoNumbers() {
        Assert.assertEquals("Should be No numbers", "No numbers",
                this.ao.theLargestNumber(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void testTwoEqualNumbers() {
        Assert.assertEquals("Should be a12a12", "a12a12",
                this.ao.theLargestNumber(Arrays.asList("a12", "b10", "c", "a12")));
    }
}
