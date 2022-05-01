package by.iba.gomel;

/**
 * StatementsTaskOne class allows to check square 2-dimensional arrays for the same chars in the
 * columns, rows, primary and secondary diagonals
 */
public final class StatementsTaskOne {

    private static final byte ARRAY_ROW = 2;
    private static final byte ARRAY_COL = 2;
    private char[][]          charArray = new char[StatementsTaskOne.ARRAY_ROW][StatementsTaskOne.ARRAY_COL];

    /**
     * columnsWithSameChars method checks if the array contains the same chars in any column and
     * returns a boolean answer
     *
     * @param charArray
     *            - a 2-dimensional array to check.
     *
     * @return ans - a boolean answer
     *
     */
    public boolean columnsWithSameChars(final char[][] charArray) {
        final int arrayLength = charArray.length;
        boolean ans = true;
        for (int col = 0; col < charArray[0].length; col++) {
            int count = 0;
            boolean booleanCounter = false;
            for (int row = 0; row < arrayLength; row++) {
                if (charArray[0][col] == charArray[row][col]) {
                    count++;
                }
            }
            if (count == arrayLength) {
                booleanCounter = true;
            }
            ans = ans && booleanCounter;
        }
        return ans;
    }

    /**
     * getCharArray method is a getter for the 2-dimensional array charArray
     *
     * @return - a 2-dimensional array charArray
     */
    public char[][] getCharArray() {
        return this.charArray.clone();
    }

    /**
     * primaryDiagonalWithSameChars method checks if the array contains the same chars in the
     * primary diagonal and returns a boolean answer
     *
     * @param charArray
     *            - a 2-dimensional array to check.
     *
     * @return ans - a boolean answer
     *
     */
    public boolean primaryDiagonalWithSameChars(final char[][] charArray) {
        final int arrayLength = charArray.length;
        boolean ans = false;
        int count = 0;
        for (int row = 0; row < arrayLength; row++) {
            if (charArray[0][0] == charArray[row][row]) {
                count++;
            }
            if (count == arrayLength) {
                ans = true;
            }
        }
        return ans;
    }

    /**
     * rowsWithSameChars method checks if the array contains the same chars in any row and returns a
     * boolean answer
     *
     * @param charArray
     *            - a 2-dimensional array to check.
     *
     * @return ans - a boolean answer
     *
     */
    public boolean rowsWithSameChars(final char[][] charArray) {
        final int arrayLength = charArray.length;
        boolean ans = true;
        for (final char[] element : charArray) {
            boolean booleanCounter = false;
            int count = 0;
            for (final char element2 : element) {
                if (element[0] == element2) {
                    count++;
                }
            }
            if (count == arrayLength) {
                booleanCounter = true;
            }
            ans = ans && booleanCounter;
        }
        return ans;
    }

    /**
     * secondaryDiagonalWithSameChars method checks if the array contains the same chars in the
     * secondary diagonal and returns a boolean answer
     *
     * @param charArray
     *            - a 2-dimensional array to check.
     *
     * @return ans - a boolean answer
     *
     */
    public boolean secondaryDiagonalWithSameChars(final char[][] charArray) {
        final int arrayLength = charArray.length;
        boolean ans = false;
        int count = 0;
        for (int row = 0; row < arrayLength; row++) {
            if (charArray[0][charArray.length - 1] == charArray[row][charArray.length - 1 - row]) {
                count++;
            }
        }
        if (count == arrayLength) {
            ans = true;
        }
        return ans;
    }

    /**
     * setCharArray method is a setter for the 2-dimensional array charArray
     *
     * @param charArray
     *            - a 2-dimensional array to set
     *
     */
    public void setCharArray(final char[][] charArray) {
        this.charArray = charArray.clone();
    }
}
