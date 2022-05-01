package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CollectionsTask1;

public class CollectionsTask1Test {
    @Test
    public void testMultipleInt() {
        final Integer[] args = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        Assert.assertNotEquals("With some chance should not be the same as the original",
                CollectionsTask1.randomizeArr(args), args);
    }

    @Test
    public void testSingleInt() {
        final Integer[] args = new Integer[] {1};
        Assert.assertArrayEquals("With some chance should not be the same as the original",
                CollectionsTask1.randomizeArr(args), args);
    }

    @Test
    public void testString() {
        final String[] args = new String[] {"Bob", "Ross", "Paul", "Chrono", "Killer", "Reick",
                "Esma"};
        Assert.assertNotEquals("With some chance should not be the same as the original",
                CollectionsTask1.randomizeArr(args), args);
    }
}
