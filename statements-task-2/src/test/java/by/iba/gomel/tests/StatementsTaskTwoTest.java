package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.StatementsTaskTwo;

/**
 * "StatementsTaskTwoTest" tests a "StatementsTaskTwo" class. Gives an array to a class and tests if
 * an array returns as sorted.
 */
public class StatementsTaskTwoTest {
    StatementsTaskTwo   array             = new StatementsTaskTwo();
    private final int[] unsortedTestArray = {4, 1, 3, 165, 100, 0, 41, 13, 91, 1000};
    private final int[] sortedTestArray   = {0, 1, 3, 4, 13, 41, 91, 100, 165, 1000};

    /**
     * "getSortedTestArray method" is a getter for sortedTestArray
     *
     * @return - 1-dimensional array sortedTestArray
     */
    public int[] getSortedTestArray() {
        return this.sortedTestArray;
    }

    /**
     * "getUnsortedTestArray" method is a getter for unsortedTestArray
     *
     * @return - 1-dimensional array unsortedTestArray
     */
    public int[] getUnsortedTestArray() {
        return this.unsortedTestArray;
    }

    /**
     * "testSortMethodExecution" is a method that gives an array to a "sortMethodExecution" method
     * and expects sorted array in return.
     */
    @Test
    public void testSortMethodExecution() {
        Assert.assertArrayEquals("The returned array should be sorted as expected",
                this.sortedTestArray, this.array.sortMethodExecution(this.unsortedTestArray));
    }
}
