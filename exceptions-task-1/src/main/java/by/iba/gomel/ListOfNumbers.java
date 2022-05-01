package by.iba.gomel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class creates a Vector of size 10, adds digits in it and creates two files with an input and
 * an output information.
 */
public class ListOfNumbers {
    private static final Logger      LOG  = LoggerFactory.getLogger(ListOfNumbers.class);
    private static final int         SIZE = 10;
    private final ArrayList<Integer> vector;

    /**
     * A constructor, that creates the Vector of size 10 and adds elements from 0 to 9.
     */
    public ListOfNumbers() {
        this.vector = new ArrayList<>(ListOfNumbers.SIZE);
        for (int i = 0; i < ListOfNumbers.SIZE; i++) {
            this.vector.add(i);
        }
    }

    /**
     * Invokes the readList() and the writeList() methods.
     */
    public void invokeListOfNumbers() {
        this.readList("InFile.txt");
        this.writeList();
    }

    /**
     * The method creates a file with the input information. The try block takes elements from the
     * file, while there are any, converts String to Integer, outputs element and adds to the
     * Vector. Catches FileNotFoundException and IOException. In the finally block outputs info of
     * exiting the try statement.
     *
     * @param fileName
     *            - a String variable, file name to create and read from.
     */
    public void readList(final String fileName) {
        String line = null;

        try (final RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            ListOfNumbers.LOG.info("Entering the readList() try statement");
            while ((line = raf.readLine()) != null) {
                final Integer i = Integer.parseInt(line);
                ListOfNumbers.LOG.info("{}", i);
                this.vector.add(i);
            }
        } catch (final FileNotFoundException e) {
            ListOfNumbers.LOG.error("File: {} not found.", fileName, e);
        } catch (final IOException e) {
            ListOfNumbers.LOG.error(e.getMessage(), e);
        } finally {
            ListOfNumbers.LOG.info("Exiting the readList() try statement");
        }
    }

    /**
     * The method creates a file and outputs elements of the Vector there in a try statement.
     * Catches ArrayIndexOutOfBoundsException and IOException. In a finally block if the file was
     * not created - prints it, if was created - prints closing message.
     */
    public void writeList() {
        RandomAccessFile emptyFile = null;

        try (final RandomAccessFile out = new RandomAccessFile("OutFile.txt", "rw")) {
            ListOfNumbers.LOG.info("Entering the writeList() try statement");
            emptyFile = out;
            for (int i = 0; i < (this.vector.size()); i++) {
                out.writeUTF("Value at: " + i + " = " + this.vector.get(i));
            }
        } catch (final IOException e) {
            ListOfNumbers.LOG.error("Caught IOException: {}", e.getMessage(), e);
        } finally {
            if (emptyFile == null) {
                ListOfNumbers.LOG.info("PrintWriter in the writeList() method is not open");
            } else {
                ListOfNumbers.LOG.info("Closing PrintWriter in the writeList() method");
            }
        }
    }
}
