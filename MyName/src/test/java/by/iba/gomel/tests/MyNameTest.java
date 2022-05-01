package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.MyName;

public class MyNameTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        MyName.main(new String[] {});
        Assert.assertEquals("My name is Maksim string should be in system out", "My name is Maksim",
                this.log.getLog());
    }

}
