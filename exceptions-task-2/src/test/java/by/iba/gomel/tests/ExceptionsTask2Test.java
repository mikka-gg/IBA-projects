package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.ExceptionsTask2;
import by.iba.gomel.NonLetterException;

/**
 * Tests the ExceptionsTask2 class by passing to the checkForLatinLetter() method different
 * sequences, and if the sequence does not have a Latin letter - NonLetterException is expected.
 *
 * BOOLEAN EXPRESSIONS ARE JUST FOR TESTING.
 */
public class ExceptionsTask2Test {
    private static final Logger   LOG = LoggerFactory.getLogger(ExceptionsTask2Test.class);
    private final ExceptionsTask2 obj = new ExceptionsTask2();

    /**
     * A passing sequence has Russian 'c' letter, NonLetterException is expected.
     */
    @Test
    public void testCheckForLatinLetter1() {
        try {
            Assert.assertTrue("Always true",
                    this.obj.checkForLatinLetter(new char[] {'a', 'p', 'k', 's', 'с'}));

        } catch (final NonLetterException e) {
            ExceptionsTask2Test.LOG.error("NonLetterException occured", e);
        }
    }

    /**
     * A sequence with all Latin letters, no expression is expected.
     */
    @Test
    public void testCheckForLatinLetter2() {
        try {
            Assert.assertTrue("Always true",
                    this.obj.checkForLatinLetter(new char[] {'a', 'P', 'k'}));

        } catch (final NonLetterException e) {
            ExceptionsTask2Test.LOG.error("NonLetterException  occured", e);
        }
    }

    /**
     * A passing sequence has Russian 'p' letter, NonLetterException is expected.
     */
    @Test
    public void testCheckForLatinLetterTest3() {
        try {
            Assert.assertTrue("Always true",
                    this.obj.checkForLatinLetter(new char[] {'a', 'р', 'k'}));

        } catch (final NonLetterException e) {
            ExceptionsTask2Test.LOG.error("NonLetterException  occured", e);
        }
    }
}
