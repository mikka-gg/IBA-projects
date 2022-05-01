package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.StatementsTaskOne;

/**
 * StatementsTaskOneTest tests StatementsTaskOne class. Contains test array of chars which is tested
 * to contain identical symbols in its rows, columns, primary and secondary diagonals.
 */
public class StatementsTaskOneTest {

    private final char[][] testCharArray = {{'a', 'a'}, {'a', 'a'}};

    StatementsTaskOne      array         = new StatementsTaskOne();

    /**
     * arrayFilling method fills the StatementsTaskOne's 2-dimensional array with tested array
     * before each test.
     */
    @Before
    public void arrayFilling() {
        this.array.setCharArray(this.getTestCharArray());
    }

    /**
     * getTestCharArray method is a getter for testCharArray
     *
     * @return - a 2-dimensional array testCharArray
     */
    public char[][] getTestCharArray() {
        return this.testCharArray;
    }

    /**
     * testColumnsWithSameChars method tests, if the char array has the same symbols in the columns.
     * Should be true, if all symbols are the same.
     */
    @Test
    public void testColumnsWithSameChars() {
        Assert.assertTrue("Should return true if all symbols in the columns are the same",
                this.array.columnsWithSameChars(this.array.getCharArray()));
    }

    /**
     * testPrimaryDiagonalWithSameChars method tests, if the char array has the same symbols in the
     * primary diagonal. Should be true, if all symbols are the same.
     */
    @Test
    public void testPrimaryDiagonalWithSameChars() {
        Assert.assertTrue("Should return true if all symbols in the primary diagonal are the same",
                this.array.primaryDiagonalWithSameChars(this.array.getCharArray()));
    }

    /**
     * testRowsWithSameChars method tests, if the char array has the same symbols in the rows.
     * Should be true, if all symbols are the same.
     */
    @Test
    public void testRowsWithSameChars() {
        Assert.assertTrue("Should return true if all symbols in the rows are the same",
                this.array.rowsWithSameChars(this.array.getCharArray()));
    }

    /**
     * testSecondaryDiagonalWithSameChars method tests, if the char array has the same symbols in
     * the second diagonal. Should be true, if all symbols are the same.
     */
    @Test
    public void testSecondaryDiagonalWithSameChars() {
        Assert.assertTrue(
                "Should return true if all symbols in the secondary diagonal are the same",
                this.array.secondaryDiagonalWithSameChars(this.array.getCharArray()));
    }
}
