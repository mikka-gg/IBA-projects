package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ClassOne;
import by.iba.gomel.ClassTwo;

/**
 * This class tests the ClassOne and ClassTwo classes. The ClassOne overrides and hides the methods
 * of the interface Log, the ClassTwo only overrides the default method, but uses the original
 * static method.
 */
public class InterfaceTest {
    ClassOne objOne = new ClassOne();
    ClassTwo objTwo = new ClassTwo();

    /**
     * Tests the overridden default method log of the interface Log implemented by the ClassOne,
     * should return a value different from the original.
     */
    @Test
    public void testLogDefaultOverride1() {
        Assert.assertEquals("Should return 'ClassOne ClassOne'", "ClassOne ClassOne",
                this.objOne.log("ClassOne"));
    }

    /**
     * Tests the overridden default method log of the interface Log implemented by the ClassTwo,
     * should return a value different from the original.
     */
    @Test
    public void testLogDefaultOverride2() {
        Assert.assertEquals("Should return 'ClassTwo ClassTwo'", "ClassTwo ClassTwo",
                this.objTwo.log("ClassTwo"));
    }

    /**
     * Tests the hidden static method log of the interface Log implemented by the CLassOne, should
     * return a value different from the basic static method of the interface.
     */
    @Test
    public void testStaticHide() {
        Assert.assertEquals("Should return 'HIDES STATIC 5 method'", "HIDES STATIC 5 method",
                this.objOne.log("5", "method"));
    }

    /**
     * Tests NOT hidden method log of the interface Log implemented by the CLassTwo, should return a
     * value of the basic static method.
     */
    @Test
    public void testStaticInt() {
        Assert.assertEquals("Should return '5 INTERFACE method'", "5 INTERFACE method",
                this.objTwo.log("5", "method"));
    }

}
