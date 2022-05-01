package by.iba.gomel.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.OperatorsTaskTwo;

public class OperatorsTaskTwoTest {

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
        final Constructor<OperatorsTaskTwo> constructor = OperatorsTaskTwo.class
                .getDeclaredConstructor();
        Assert.assertTrue("Constructor test", Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * testNegLeftShift
     */
    @Test
    public void testNegLeftShift() {
        Assert.assertEquals("Should return -40", 0b111111111111111111111111_11011000,
                OperatorsTaskTwo.negLeftShift());
    }

    /**
     * testNegRightShift
     */
    @Test
    public void testNegRightShift() {
        Assert.assertEquals("Should return -3", 0b111111111111111111111111_11111101,
                OperatorsTaskTwo.negRightShift());
    }

    /**
     * testNegUnRightShift
     */
    @Test
    public void testNegUnRightShift() {
        Assert.assertEquals("Should return 1073741821", 0b001111111111111111111111_11111101,
                OperatorsTaskTwo.negUnRightShift());
    }

    /**
     * testPosLeftShift
     */
    @Test
    public void testPosLeftShift() {
        Assert.assertEquals("Should return 40", 0b00101000, OperatorsTaskTwo.posLeftShift());
    }

    /**
     * testPosRightShift
     */
    @Test
    public void testPosRightShift() {
        Assert.assertEquals("Should return 3", 0b00000010, OperatorsTaskTwo.posRightShift());
    }

    /**
     * testPosUnRightShift
     */
    @Test
    public void testPosUnRightShift() {
        Assert.assertEquals("Should return unsigned 3", 0b00000010,
                OperatorsTaskTwo.posUnRightShift());
    }
}
