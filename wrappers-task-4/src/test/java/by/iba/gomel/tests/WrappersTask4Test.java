package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WrappersTask4;

/*
 * Tests the WrappersTask4 class.
 */
public class WrappersTask4Test {

    /**
     * Tests the static checkPasswordStrength() method by sending passwords as arguments, if
     * password is 8 and more elements, contains at least 1 digit, upper and lower case letter -
     * should return true.
     */
    @Test
    public void testCheckPasswordStrength() {
        Assert.assertTrue("Should return true, a password is strong",
                WrappersTask4.checkPasswordStrength("ja23aAD04"));
        Assert.assertTrue("Should return true, a password is strong",
                WrappersTask4.checkPasswordStrength("ja23aAD04"));
        Assert.assertFalse("Should return false, a password is not strong enough",
                WrappersTask4.checkPasswordStrength("password"));
        Assert.assertFalse("Should return false, a password is not strong enough",
                WrappersTask4.checkPasswordStrength("12345678"));
        Assert.assertFalse("Should return false, a password is not strong enough",
                WrappersTask4.checkPasswordStrength("Admin1"));
    }

}
