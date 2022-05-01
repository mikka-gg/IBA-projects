package by.iba.gomel.tests;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.DataStructure;
import by.iba.gomel.DataStructure.DataStructureIterator;

public class DataStructureTest {
    final DataStructure        dataStructure = new DataStructure();

    @Rule
    public final SystemOutRule log           = new SystemOutRule().enableLog();

    @Test
    public void testAnonymousClass() {
        this.dataStructure.print(new DataStructureIterator() {

            private int nextIndex = 1;

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
                // Record a value of an odd index of the array
                final Integer retValue = Integer.valueOf(
                        DataStructureTest.this.dataStructure.getArrayOfInts(this.nextIndex));

                // Get the next odd element
                this.nextIndex += DataStructure.INDEX_STEP;
                return retValue;
            }

        });
        Assert.assertEquals("Should print odd numbers", "The print() method - 1 3 5 7 9 11 13 \n",
                this.log.getLog());
    }

    @Test
    public void testPrint() {
        this.dataStructure.print(this.dataStructure.new EvenIterator());
        Assert.assertEquals("Should print even numbers",
                "The print() method - 0 2 4 6 8 10 12 14 \n", this.log.getLog());
    }

    @Test
    public void testPrintEven() {
        this.dataStructure.printEven();
        Assert.assertEquals("Should print even numbers",
                "The printEven() method - 0 2 4 6 8 10 12 14 \n", this.log.getLog());
    }
}
