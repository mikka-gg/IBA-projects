package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.BadThreads;

public class BadThreadsTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMessageFromConsole() throws InterruptedException {
        BadThreads.main(new String[] {});
        Assert.assertEquals("The message should always be Mares do eat oats.", "Mares do eat oats.",
                this.log.getLog());
    }

}
