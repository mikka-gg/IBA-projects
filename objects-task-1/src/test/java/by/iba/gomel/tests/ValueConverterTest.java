package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ValueConverter;

/**
 * This test class creates Objects with integer or floating point values and checks if
 * "ValueConverter" return a right variable type name.
 */
public class ValueConverterTest {
    ValueConverter charValue    = new ValueConverter('a');
    ValueConverter integerValue = new ValueConverter(34);
    ValueConverter shortValue   = new ValueConverter((short) 12);
    ValueConverter longValue    = new ValueConverter(411L);
    ValueConverter floatValue   = new ValueConverter(34.12F);
    ValueConverter doubleValue  = new ValueConverter(34.123D);
    ValueConverter byteValue    = new ValueConverter((byte) 34);

    /**
     * This test method invokes "convertingValueToString" method using Objects and expects a right
     * variable type name in return.
     */
    @Test
    public void testConvertingValueToString() {
        Assert.assertEquals("Should return Char type name", "Char",
                this.charValue.convertingValueToString());
        Assert.assertEquals("Should return Integer type name", "Integer",
                this.integerValue.convertingValueToString());
        Assert.assertEquals("Should return Short type name", "Short",
                this.shortValue.convertingValueToString());
        Assert.assertEquals("Should return Long type name", "Long",
                this.longValue.convertingValueToString());
        Assert.assertEquals("Should return Float type name", "Float",
                this.floatValue.convertingValueToString());
        Assert.assertEquals("Should return Double type name", "Double",
                this.doubleValue.convertingValueToString());
        Assert.assertEquals("Should return Byte type name", "Byte",
                this.byteValue.convertingValueToString());
    }

}
