package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.PrimitiveConversions;

/**
 * PrimitiveConversionsTest
 */
public class PrimitiveConversionsTest {

    /**
     * ByteConversionTest
     */
    @Test
    public void testByteConversion() {
        final byte byteTestResult = PrimitiveConversions.primConvertToByte((byte) 3);
        Assert.assertEquals("Should return byte", 62, byteTestResult);
    }

    /**
     * intConversionTest
     */
    @Test
    public void testIntConversion() {
        final int intTestResult = PrimitiveConversions.primConvertToInt(1000);
        Assert.assertEquals("Should return int", 65, intTestResult);
    }

    /**
     * LongConversionTest
     */
    @Test
    public void testLongConversion() {
        final long longTestResult = PrimitiveConversions.primConvertToLong(15365L);
        Assert.assertEquals("Should return long", 522_594_369L, longTestResult);
    }
}
