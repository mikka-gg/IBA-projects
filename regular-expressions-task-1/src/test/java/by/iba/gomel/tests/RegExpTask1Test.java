package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RegExpTask1;

public class RegExpTask1Test {

    @Test
    public void testMatchName() {
        final RegExpTask1 re = new RegExpTask1();

        // TRUE tests
        Assert.assertTrue("Rigth pattern, should return true", re.matchName("Name Name"));
        Assert.assertTrue("Rigth pattern, should return true", re.matchName("Joe Doe"));

        // FALSE tests
        Assert.assertFalse("The length of the names differs, should return false",
                re.matchName("Uladzislau Melanchyk"));
        Assert.assertFalse("Doesn't have lower-case letters after upper-case, should return false",
                re.matchName("A B"));
        Assert.assertFalse("Only one word, should return false", re.matchName("Aaa"));
        Assert.assertFalse("An empty String, should return false", re.matchName(""));
    }

}
