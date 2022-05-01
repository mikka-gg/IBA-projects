package by.iba.gomel;

/**
 * "StatementsTaskTwo" is a class that takes an integer 1-dimensional array up to 100 elements and
 * sorts it from lowest to highest element.
 */
public class StatementsTaskTwo {
    private static final int MAX_ARRAY_RANGE = 100;

    /**
     * "sortMethod" is a method that sorts given array from lowest to highest element.
     *
     * @param arrayOfInts
     *            - unsorted 1-dimensional array
     */
    private static void sortMethod(final int[] arrayOfInts) {
        int buffer = 0;
        for (int i = 1; i < arrayOfInts.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayOfInts[j] < arrayOfInts[j - 1]) {
                    buffer = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[j - 1];
                    arrayOfInts[j - 1] = buffer;
                }
            }
        }
    }

    /**
     * "sortMethodExecution" method checks if an array is appropriate length and invokes
     * "sortMethodExecution"
     *
     * @param arrayOfInts
     *            - unsorted 1-dimensional array
     * @return arrayOfInts - sorted 1-dimensional array
     */
    public int[] sortMethodExecution(final int[] arrayOfInts) {
        if ((arrayOfInts.length > 0) && (arrayOfInts.length < StatementsTaskTwo.MAX_ARRAY_RANGE)) {
            StatementsTaskTwo.sortMethod(arrayOfInts);
        }
        return arrayOfInts;
    }
}
