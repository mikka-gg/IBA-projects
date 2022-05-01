package by.iba.gomel.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ActionsOnFile;

public class UserInputTest {
    @After
    public void deleteFile() throws IOException {
        Files.delete(Paths.get("File.txt"));
    }

    @Test
    public void testCreateFile() throws IOException {
        final ActionsOnFile aof = new ActionsOnFile();
        aof.createViewExit();
        Assert.assertTrue("The file should be deleted", Files.exists(Paths.get("File.txt")));
    }
}
