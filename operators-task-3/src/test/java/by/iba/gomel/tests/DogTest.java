package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Dog;

/**
 * DogTest
 */
public class DogTest {

    /**
     * testComparingObjects
     */
    @Test
    public void testComparingObjects() {
        Assert.assertFalse("Should return FALSE for equals()", Dog.comparingObjectsUsingEquals());
        Assert.assertFalse("Should return FALSE for ==", Dog.comparingObjectsUsingEqOperator());

        Assert.assertTrue("Should return TRUE for reference equals()",
                Dog.comparingReferenceUsingEquals());
        Assert.assertTrue("Should return TRUE fo reference ==",
                Dog.comparingReferenceUsingEqOperator());
    }
}
