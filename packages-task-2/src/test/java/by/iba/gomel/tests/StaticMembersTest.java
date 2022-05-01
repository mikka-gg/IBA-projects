package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import static by.iba.gomel.five.level.StaticMembers.*;

/**
 * Test class to directly access static members of 'StaticMembers' class
 */
public class StaticMembersTest {

    /**
     * Directly access 'fullName' method of 'StaticMembers' class
     */
    @Test
    public void testFullName() {
        Assert.assertEquals("Should return 'Full Name'", "Full Name", fullName());
    }

    /**
     * Directly access 'riseTemp' method of 'StaticMembers' class
     */
    @Test
    public void testRiseTemp() {
        Assert.assertEquals("Should return '27'", 27, riseTemp());
    }

    /**
     * Directly access 'TEMP_CONST' and 'NAME_CONST' variables of 'StaticMembers' class
     */
    @Test
    public void testStaticMembers() {
        Assert.assertEquals("Should return '25'", 25, TEMP_CONST);
        Assert.assertEquals("Should return 'Name'", "Name", NAME_CONST);
    }

}
