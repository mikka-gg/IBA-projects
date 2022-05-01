package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArraysTask;

/**
 * ArraysTaskTest
 */
public class ArraysTaskTest {

    /**
     * testChar1
     */
    @Test
    public void testChar1() {
        final char[][] charArrayTest = {{'A', 'B'}, {'C', 'D'}};
        Assert.assertArrayEquals("charArrayTest should equals array", charArrayTest,
                ArraysTask.getChararray1());
    }

    /**
     * testInputChar
     */
    @Test
    public void testInputChar2() {
        final char[][] charArrayTest = new char[2][2];

        Assert.assertArrayEquals("charArrayTest should equals array", charArrayTest,
                ArraysTask.getChararray2());
        Assert.assertArrayEquals("Should return array of char", charArrayTest,
                ArraysTask.inputChar(charArrayTest));
    }

    /**
     * testInputInt
     */
    @Test
    public void testInputInt2() {
        final int[][][] intArrayTest = new int[2][2][2];

        Assert.assertArrayEquals("intArrayTest should equals array", intArrayTest,
                ArraysTask.getIntegerarray2());
        Assert.assertArrayEquals("Should return array of int", intArrayTest,
                ArraysTask.inputInt(intArrayTest));
    }

    /**
     * testArrays
     */
    @Test
    public void testInt1() {
        final int[][][] intArrayTest = {{{10, 3}, {512, 33}}, {{101, 23}, {1301, 413}}};

        Assert.assertArrayEquals("intArrayTest should equals array", intArrayTest,
                ArraysTask.getIntegerarray1());

    }

}
