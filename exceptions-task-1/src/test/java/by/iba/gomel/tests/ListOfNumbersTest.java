package by.iba.gomel.tests;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.ListOfNumbers;

/**
 * The test class for the ListOfNumbers class. Fills the input file using an elementsToWrite array,
 * then checks if the input file contains all the elements of the array.
 */
public class ListOfNumbersTest {
    private static final Logger LOG             = LoggerFactory.getLogger(ListOfNumbers.class);
    final ListOfNumbers         lon             = new ListOfNumbers();
    private final int[]         elementsToWrite = {123, 4235, 1231, 65346345, 213134, 412, 745674,
            1234, 7456, 123421};
    private final String        fileName        = "InFile.txt";

    /**
     * Fills the input file with elements from the elementsToWrite array. Catches
     * FileNotFoundException and IOException. When done, invokes the invokeListOfNumbers() method,
     * to run the readList() and the readList() methods of the ListOfNumbers class.
     */
    public void fillInputFile() {
        try (final PrintWriter in = new PrintWriter(new FileWriter(this.fileName))) {
            for (final int element : this.elementsToWrite) {
                in.println(element);
            }

        } catch (final FileNotFoundException e) {
            ListOfNumbersTest.LOG.error("File: {} not found", this.fileName);
        } catch (final IOException e) {
            ListOfNumbersTest.LOG.error(e.getMessage());
        }
        this.lon.invokeListOfNumbers();
    }

    /**
     * Invokes the fillInputFile() method, then checks if the input file contains all the elements
     * of the array.
     */
    @Test
    public void testListOfNumbers() {
        this.fillInputFile();

        try (final RandomAccessFile raf = new RandomAccessFile(this.fileName, "r")) {
            for (final Integer element : this.elementsToWrite) {
                final Integer intValue = Integer.parseInt(raf.readLine());
                Assert.assertEquals(
                        "An Element of the array should be the same as an element of the input file",
                        element, intValue);
            }
        } catch (final IOException e) {
            ListOfNumbersTest.LOG.error("IOException {}", e.getMessage(), e);
        }
    }
}
