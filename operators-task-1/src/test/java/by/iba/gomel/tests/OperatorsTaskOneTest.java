package by.iba.gomel.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.OperatorsTaskOne;

/**
 * OperatorsTaskOneTest
 */
public class OperatorsTaskOneTest {

    /**
     * testArithmeticDemo
     */
    @Test
    public void testArithmeticDemo() {
        Assert.assertEquals("Should return 3", 3, OperatorsTaskOne.arithmeticDemo());
    }

    /**
     * CONSTRUCTOR TEST
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        final Constructor<OperatorsTaskOne> constructor = OperatorsTaskOne.class
                .getDeclaredConstructor();
        Assert.assertTrue("Constructor test", Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
