package by.iba.gomel.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.iba.gomel.Display;
import by.iba.gomel.FileLogic;

public class FileLogicTest {
    private static Display      m1 = new Display("1920x1080", 50, "Samsung");
    private static Display      m2 = new Display("1280x720", 60, "AOC");
    private static List<Object> displaysFromFile;

    @BeforeClass
    public static void fillFile() throws IOException {
        final String fileName = "Displays.txt";
        FileLogic.createFile(fileName);
        final ArrayList<Display> displays = new ArrayList<>();
        displays.add(FileLogicTest.m1);
        displays.add(FileLogicTest.m2);
        FileLogic.storeObjectToFile(fileName, displays);
        FileLogicTest.displaysFromFile = FileLogic.getObjectFromFile(fileName);
    }

    @Test
    public void testFirstDisplay() {
        Assert.assertEquals("The content of the objects should be equal",
                FileLogicTest.m1.toString(), FileLogicTest.displaysFromFile.get(0).toString());
    }

    @Test
    public void testSecondDisplay() {
        Assert.assertEquals("The content of the objects should be equal",
                FileLogicTest.m2.toString(), FileLogicTest.displaysFromFile.get(1).toString());
    }
}
