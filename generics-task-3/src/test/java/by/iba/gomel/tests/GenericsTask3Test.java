package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.GenericsTask3;
import by.iba.gomel.enums.Crime;
import by.iba.gomel.enums.Fantasy;
import by.iba.gomel.enums.Mystery;
import by.iba.gomel.enums.RomancePart1;
import by.iba.gomel.enums.RomancePart2;
import by.iba.gomel.enums.ScienceFictionPart1;
import by.iba.gomel.enums.ScienceFictionPart2;

public class GenericsTask3Test {

    @Test
    public void testCrime() {
        Assert.assertEquals("Should return an instance of the Crime enum", Crime.class,
                GenericsTask3.randomGenre(Crime.class).getClass());
    }

    @Test
    public void testFantasy() {
        Assert.assertEquals("Should return an instance of the Fantasy enum", Fantasy.class,
                GenericsTask3.randomGenre(Fantasy.class).getClass());
    }

    @Test
    public void testMystery() {
        Assert.assertEquals("Should return an instance of the Mystery enum", Mystery.class,
                GenericsTask3.randomGenre(Mystery.class).getClass());
    }

    @Test
    public void testRomance() {
        Assert.assertEquals("Should return an instance of the Romance enum", RomancePart1.class,
                GenericsTask3.randomGenre(RomancePart1.class).getClass());
    }

    @Test
    public void testRomancePart2() {
        Assert.assertEquals("Should return an instance of the Romance enum", RomancePart2.class,
                GenericsTask3.randomGenre(RomancePart2.class).getClass());
    }

    @Test
    public void testScienceFiction() {
        Assert.assertEquals("Should return an instance of the ScienceFiction enum",
                ScienceFictionPart1.class,
                GenericsTask3.randomGenre(ScienceFictionPart1.class).getClass());
    }

    @Test
    public void testScienceFictionPart2() {
        Assert.assertEquals("Should return an instance of the ScienceFiction enum",
                ScienceFictionPart2.class,
                GenericsTask3.randomGenre(ScienceFictionPart2.class).getClass());
    }
}
