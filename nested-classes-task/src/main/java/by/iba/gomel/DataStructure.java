package by.iba.gomel;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class creates an array of ints, fill it and prints the values.
 */
public class DataStructure {

    public static final int     INDEX_STEP  = 2;
    // Create an array
    public static final int     SIZE        = 15;
    /**
     * Logger.
     *
     */
    private static final Logger LOGGER      = LoggerFactory.getLogger(DataStructure.class);

    private final int[]         arrayOfInts = new int[DataStructure.SIZE];

    /**
     * Default constructor. Initializes {@link #arrayOfInts} of {@link #SIZE} with ints starting
     * from 0 up to {@link #SIZE}.
     */
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < DataStructure.SIZE; i++) {
            this.arrayOfInts[i] = i;
        }
    }

    /**
     * Fills the {@link #arrayOfInts} with int values and prints out only values of even indices.
     *
     * @param args
     *            method parameters. Not used in this implementation.
     */
    public static void main(final String[] args) {
        final DataStructure dataStructure = new DataStructure();
        dataStructure.printEven();
    }

    /**
     * Getter for the {@link #arrayOfInts}
     *
     * @param index
     *            - index of the value
     * @return value from the {@link #arrayOfInts}
     */
    public int getArrayOfInts(final int index) {
        return this.arrayOfInts[index];
    }

    /**
     * Prints out values of the {@link #arrayOfInts}.
     *
     * @param iterator
     *            - instances of the DataStructureIterator interface.
     */
    public final void print(final DataStructureIterator iterator) {
        DataStructure.LOGGER.info("The print() method - ");
        while (iterator.hasNext()) {
            DataStructure.LOGGER.info("{} ", iterator.next());
        }
        DataStructure.LOGGER.info("\n");
    }

    /**
     * Prints out values of even indices of the {@link #arrayOfInts}.
     */
    public final void printEven() {
        final DataStructureIterator iterator = this.new EvenIterator();
        DataStructure.LOGGER.info("The printEven() method - ");
        while (iterator.hasNext()) {
            DataStructure.LOGGER.info("{} ", iterator.next());
        }
        DataStructure.LOGGER.info("\n");
    }

    /**
     * Extends the Iterator interface.
     */
    public interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    /**
     * Inner class implements the DataStructureIterator interface.
     */
    public class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex;

        /**
         * Default constructor.
         */
        public EvenIterator() {
            this.nextIndex = 0;
        }

        @Override
        public boolean hasNext() {

            // Check if the current element is the last in the array
            return this.nextIndex <= (DataStructure.SIZE - 1);
        }

        @Override
        public Integer next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            // Record a value of an even index of the array
            final Integer retValue = Integer
                    .valueOf(DataStructure.this.arrayOfInts[this.nextIndex]);

            // Get the next even element
            this.nextIndex += DataStructure.INDEX_STEP;
            return retValue;
        }

        @Override
        public void remove() {
            // Do nothing

        }
    }
}
