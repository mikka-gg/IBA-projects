package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AnnotationsTaskThree;
import by.iba.gomel.Workaround;

public class AnnotationsTaskThreeTest {

    @Test
    public void testAnnotations() {
        final Workaround[] wk = AnnotationsTaskThree.class.getAnnotationsByType(Workaround.class);
        Assert.assertEquals("Should return a 3rd authour name", "Smith", wk[2].author());
        Assert.assertEquals("Should return a 1st authour name", "Doe", wk[0].author());
        Assert.assertEquals("Should return a 2nd release number", 2, wk[1].releaseNumber());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Should return a sended name", "Joe",
                new AnnotationsTaskThree().getName("Joe"));
    }
}
