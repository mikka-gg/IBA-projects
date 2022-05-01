package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArithmeticalProgression;

/**
 * This is a test class for 'ArithmeticalProgression' class. It creates objects and using
 * 'calculatingAP' method creates arithmetic progression(AP). Then tests values in the AP.
 */
public class ArithmeticalProgressionTest {

    /**
     * This method creates objects of 'ArithmeticalProgression' class and invokes 'calculatingAP' to
     * create an AP. Then tests its values.
     */
    @Test
    public void testCalculatingAP() {
        final ArithmeticalProgression arithmeticalProg1 = new ArithmeticalProgression();

        arithmeticalProg1.calculatingAP(10, 2, 1);
        Assert.assertEquals("Should return the total number of elements of 'arithmeticalProg1' ",
                10, arithmeticalProg1.getObjectsNumberOfElements(7));
        Assert.assertEquals("Should return the value of element '2' of 'arithmeticalProg1' ", 3,
                arithmeticalProg1.getObjectsValue(2));
        Assert.assertEquals("Should return the the first element of 'arithmeticalProg1' ", 1,
                arithmeticalProg1.getObjectsFirstElement(8));
        Assert.assertEquals("Should return the last element of 'arithmeticalProg1' ", 19,
                arithmeticalProg1.getObjectsLastElement(10));
        Assert.assertEquals("Should return the step of 'arithmeticalProg1' ", 2,
                arithmeticalProg1.getObjectsStep(4));
        Assert.assertEquals("Should return the total sum of elements of 'arithmeticalProg1' 6", 100,
                arithmeticalProg1.getObjectsSumOfElements(2));

        arithmeticalProg1.calculatingAP(20, 5, 4);
        Assert.assertEquals("Should return the total number of elements of 'arithmeticalProg2' ",
                20, arithmeticalProg1.getObjectsNumberOfElements(7));
        Assert.assertEquals("Should return the value of element '15' of 'arithmeticalProg2' ", 74,
                arithmeticalProg1.getObjectsValue(15));
        Assert.assertEquals("Should return the value of element '10' of 'arithmeticalProg2' ", 49,
                arithmeticalProg1.getObjectsValue(10));
        Assert.assertEquals("Should return the the first element of 'arithmeticalProg2' ", 4,
                arithmeticalProg1.getObjectsFirstElement(8));
        Assert.assertEquals("Should return the last element of 'arithmeticalProg2' ", 99,
                arithmeticalProg1.getObjectsLastElement(20));
        Assert.assertEquals("Should return the step of 'arithmeticalProg2' ", 5,
                arithmeticalProg1.getObjectsStep(20));
        Assert.assertEquals("Should return the total sum of elements of 'arithmeticalProg2' 6",
                1030, arithmeticalProg1.getObjectsSumOfElements(1));
    }

}
