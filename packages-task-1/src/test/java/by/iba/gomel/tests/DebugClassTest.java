package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.debug.DebugClass;

/**
 * To access classes with same name in different packages need to import package for first, and to
 * use a package name to access the class
 */
public class DebugClassTest {

    /**
     * An example of using classes with same names but in different packages
     */
    @Test
    public void testDebug() {
        final DebugClass debug = new DebugClass();
        Assert.assertEquals("debug package", "INFO DEBUG", debug.debug("DEBUG"));

        final by.iba.gomel.debugoff.DebugClass debugoff = new by.iba.gomel.debugoff.DebugClass();
        Assert.assertEquals("debugoff package", "WARNING DEBUG", debugoff.debug("DEBUG"));
    }

}
