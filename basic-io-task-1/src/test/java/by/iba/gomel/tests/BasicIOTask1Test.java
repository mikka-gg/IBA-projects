package by.iba.gomel.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.BasicIOTask1;

public class BasicIOTask1Test {
    private static final Logger LOG  = LoggerFactory.getLogger(BasicIOTask1Test.class);
    private static File         file = new File("File.txt");

    @AfterClass
    public static void deleteFile() {
        BasicIOTask1Test.file.delete();
    }

    @BeforeClass
    public static void initFile() {
        try (final RandomAccessFile raf = new RandomAccessFile(BasicIOTask1Test.file, "rw")) {
            raf.writeUTF("An error occurred.");
        } catch (final FileNotFoundException e) {
            BasicIOTask1Test.LOG.error("File: {} not found.", BasicIOTask1Test.file.getName(), e);
        } catch (final IOException e) {
            BasicIOTask1Test.LOG.error(e.getMessage(), e);
        }
    }

    @Test
    public void testCountChar() {
        final BasicIOTask1 io = new BasicIOTask1();
        Assert.assertEquals("The number of e should be 2", 2,
                io.countChar(BasicIOTask1Test.file, 'e'));
    }

    @Test
    public void testCountZeroChar() {
        final BasicIOTask1 io = new BasicIOTask1();
        Assert.assertEquals("Should be 0, no matches", 0, io.countChar(BasicIOTask1Test.file, 'k'));
    }
}
