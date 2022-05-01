package by.iba.gomel;

import java.security.SecureRandom;

/**
 * ArraysTask
 */
public class ArraysTask {

    private static final int[][][]    integerArray1 = {{{10, 3}, {512, 33}},
            {{101, 23}, {1301, 413}}};

    private static final char[][]     charArray1    = {{'A', 'B'}, {'C', 'D'}};

    private static final byte         X             = 2;
    private static final byte         Y             = 2;
    private static final byte         Z             = 2;

    private static final char[][]     charArray2    = new char[ArraysTask.X][ArraysTask.Y];

    private static final int[][][]    integerArray2 = new int[ArraysTask.X][ArraysTask.Y][ArraysTask.Z];

    private static final SecureRandom r             = new SecureRandom();

    private static final int          INT_RANGE     = 26;

    private static final int          CHAR_RANGE    = 100;

    ArraysTask() {

    }

    /**
     * getChararray1
     *
     * @return the chararray1
     */
    public static char[][] getChararray1() {
        return ArraysTask.charArray1;
    }

    /**
     * getChararray2
     *
     * @return the chararray2
     */
    public static char[][] getChararray2() {
        return ArraysTask.charArray2;
    }

    /**
     * getIntegerarray1
     *
     * @return the integerarray1
     */
    public static int[][][] getIntegerarray1() {
        return ArraysTask.integerArray1;
    }

    /**
     * getIntegerarray2
     *
     * @return the integerarray2
     */
    public static int[][][] getIntegerarray2() {
        return ArraysTask.integerArray2;
    }

    /**
     * inputChar
     *
     * @param charArrayTest
     *            doc
     * @return charArray2
     */
    public static char[][] inputChar(final char[][] charArrayTest) {
        // Char Array 2 Input
        for (int i = 0; i < ArraysTask.getChararray2().length; i++) {
            for (int j = 0; j < ArraysTask.getChararray2().length; j++) {
                ArraysTask
                        .getChararray2()[i][j] = (char) (ArraysTask.r.nextInt(ArraysTask.INT_RANGE)
                                + 'a');
                charArrayTest[i][j] = ArraysTask.getChararray2()[i][j];
            }
        }
        return ArraysTask.getChararray2();
    }

    /**
     * inputInt
     *
     * @param intArrayTest
     *            doc
     * @return integerArray2
     */
    public static int[][][] inputInt(final int[][][] intArrayTest) {
        // Integer Array 2 Input
        for (int i = 0; i < ArraysTask.getIntegerarray2().length; i++) {
            for (int j = 0; j < ArraysTask.getIntegerarray2().length; j++) {
                for (int k = 0; k < ArraysTask.getIntegerarray2().length; k++) {
                    ArraysTask.getIntegerarray2()[i][j][k] = (ArraysTask.r
                            .nextInt(ArraysTask.CHAR_RANGE));
                    intArrayTest[i][j][k] = ArraysTask.getIntegerarray2()[i][j][k];
                }
            }
        }
        return ArraysTask.getIntegerarray2();
    }

}
