package by.iba.gomel.tests;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FindDups;

public class FindDupsTest {

    @Test
    public void testCaseInsensitiveSortedSet() {
        final FindDups fd = new FindDups();
        final Set<String> set = fd
                .setSortedSet(new String[] {"paul", "Caren", "Paul", "caren", "aaaa"});
        final Set<String> testSet = new TreeSet<>();
        testSet.add("aaaa");
        testSet.add("Caren");
        testSet.add("paul");
        Assert.assertEquals("The sorted set should equal test set", testSet, set);
    }

    @Test
    public void testSetSize() {
        final FindDups fd = new FindDups();
        final Set<String> set = fd
                .setSortedSet(new String[] {"paul", "Caren", "Paul", "caren", "aaaa"});
        Assert.assertEquals("The size of the sorted set should equal 3", 3, fd.getSetSize(set));
    }
}
