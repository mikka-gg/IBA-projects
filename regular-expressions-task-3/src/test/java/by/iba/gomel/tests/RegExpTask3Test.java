package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RegExpTask3;

public class RegExpTask3Test {
    private final RegExpTask3 re = new RegExpTask3();

    @Test
    public void testIsbnExample() {
        Assert.assertTrue("Should return true", this.re.checkIsbn("978-621-306-40615-7"));
    }

    @Test
    public void testIsbnRegGroup() {
        Assert.assertTrue("Should return true", this.re.checkIsbn("978-621-306-40615-7"));
    }

    @Test
    public void testIsbnRegGroupFrom979in978() {
        Assert.assertFalse("The registration group element is wrong, should return false",
                this.re.checkIsbn("978-11-306-40615-7"));
    }

    @Test
    public void testIsbnRegGroupWithZeroes() {
        Assert.assertTrue("Should return true", this.re.checkIsbn("978-99910-0-0-0"));
    }

    @Test
    public void testIsbnWrongRegGroupFor978() {
        Assert.assertFalse("The registration group element is wrong, should return false",
                this.re.checkIsbn("978-45011-123-4-9"));
    }

    @Test
    public void testIsbnWrongRegGroupFor979() {
        Assert.assertFalse("The registration group element is wrong, should return false",
                this.re.checkIsbn("979-0-306-40615-7"));
    }

    @Test
    public void testKoreanIsbn() {
        Assert.assertTrue("Should return true", this.re.checkIsbn("979-11-306-40615-7"));
    }
}
