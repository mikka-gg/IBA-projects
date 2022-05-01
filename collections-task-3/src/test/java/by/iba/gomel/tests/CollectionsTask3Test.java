package by.iba.gomel.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CollectionsTask3;

public class CollectionsTask3Test {

    @Test
    public void testTrimElementsInList() {
        final CollectionsTask3 ct = new CollectionsTask3();
        final List<String> list = Arrays.asList("   was", "die    ", "   der Man    ");
        final List<String> testList = Arrays.asList("was", "die", "der Man");
        Assert.assertEquals("The trimmed List should look like the testList", testList,
                ct.trimElements(list));
    }
}
