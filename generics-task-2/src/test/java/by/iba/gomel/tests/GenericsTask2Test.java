package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.GenericsTask2;

public class GenericsTask2Test {

    @Test
    public void testIntToInt() {
        final List<Integer> copyFrom = Arrays.asList(4, 5, 6, 7);
        final List<Integer> copyTo = new ArrayList<>();
        Assert.assertEquals("Should return an equivalent collection to the copyFrom", copyFrom,
                GenericsTask2.copyCollection(copyFrom, copyTo));
    }

    @Test
    public void testIntToNumber() {
        final List<Integer> copyFrom = Arrays.asList(4, 5, 6, 7);
        final List<Number> copyTo = new ArrayList<>();
        Assert.assertEquals("Should return an equivalent collection to the copyFrom", copyFrom,
                GenericsTask2.copyCollection(copyFrom, copyTo));
    }

    @Test
    public void testStringToString() {
        final List<String> copyFrom = Arrays.asList("List", "Col");
        final List<String> copyTo = new ArrayList<>();
        Assert.assertEquals("Should return an equivalent collection to the copyFrom", copyFrom,
                GenericsTask2.copyCollection(copyFrom, copyTo));
    }
}
