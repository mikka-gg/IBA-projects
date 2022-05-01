package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RegExpTask2;

public class RegExpTask2Test {
    private final RegExpTask2 re = new RegExpTask2();

    @Test
    public void testCustomCarNumber() {
        Assert.assertTrue("Should return true", this.re.checkCarNumber("4910 MT-4"));
    }

    @Test
    public void testDefaultCarNumber() {
        Assert.assertTrue("Should return true", this.re.checkCarNumber("0000 AA-0"));
    }

    @Test
    public void testExtraDigitInEnd() {
        Assert.assertFalse("A digit after 4, should return false",
                this.re.checkCarNumber("4910 MT-44"));
    }

    @Test
    public void testExtraDigitInStart() {
        Assert.assertFalse("An extra digit after 0, should return false",
                this.re.checkCarNumber("49101 MT-4"));
    }

    @Test
    public void testExtraHyphens() {
        Assert.assertFalse("An extra hyphens between 0 and M, should return false",
                this.re.checkCarNumber("4910-MT-4"));
    }

    @Test
    public void testExtraSymbol() {
        Assert.assertFalse("An extra symbol after 4, should return false",
                this.re.checkCarNumber("4910 MT-4 a"));
    }

    @Test
    public void testNotCapitalizeSymbol() {
        Assert.assertFalse("Not capitalize t, should return false",
                this.re.checkCarNumber("4910 Mt-4"));
    }

    @Test
    public void testSymbolNotInRange() {
        Assert.assertFalse("L is not in the range, should return false",
                this.re.checkCarNumber("4910 ML-4"));
    }
}
