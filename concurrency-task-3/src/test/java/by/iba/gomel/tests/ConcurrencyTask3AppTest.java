package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.ConcurrencyTask3App;

public class ConcurrencyTask3AppTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testBuildingsAreFinished() {
        ConcurrencyTask3App.main(new String[] {});
        Assert.assertTrue("Should be true, if all the buildings are finished",
                ConcurrencyTask3App.isFinished());

    }

}
