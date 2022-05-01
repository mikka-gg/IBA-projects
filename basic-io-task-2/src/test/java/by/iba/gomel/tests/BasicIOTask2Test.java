package by.iba.gomel.tests;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.iba.gomel.BasicIOTask2;

public class BasicIOTask2Test {
    private static File file = new File("File.txt");

    @AfterClass
    public static void deleteFile() {
        BasicIOTask2Test.file.delete();
    }

    @BeforeClass
    public static void fillFile() throws IOException {
        final RandomAccessFile raf = new RandomAccessFile(BasicIOTask2Test.file, "rw");
        raf.writeLong(15);
        raf.seek(15);
        raf.writeInt(49152);
        raf.close();
    }

    @Test
    public void testReadLine15() throws IOException {
        final BasicIOTask2 io = new BasicIOTask2(BasicIOTask2Test.file);
        Assert.assertEquals("Should return 49152 in line 15", 49152, io.readMsg());
    }

}
