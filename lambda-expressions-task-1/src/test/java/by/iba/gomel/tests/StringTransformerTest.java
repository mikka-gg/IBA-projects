package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.StringTransformer;

public class StringTransformerTest {

    @Test
    public void testOperateOnString() {

        // TO LOWER CASE
        final StringTransformer toLowerCase = (x) -> {
            return x.toLowerCase();
        };
        Assert.assertEquals("Should return a String in lower case", "to lower case",
                toLowerCase.operateOnString("To Lower Case"));

        // TO UPPER CASE
        final StringTransformer toUpperCase = (x) -> {
            return x.toUpperCase();
        };
        Assert.assertEquals("Should return a String in upper case", "TO UPPER CASE",
                toUpperCase.operateOnString("To UPPER Case"));

        // REMOVE SPACES
        final StringTransformer removeSpaces = (x) -> {
            return x.trim();
        };
        Assert.assertEquals("Should return a String without spaces", "Removespaces",
                removeSpaces.operateOnString("Removespaces"));
    }

}
