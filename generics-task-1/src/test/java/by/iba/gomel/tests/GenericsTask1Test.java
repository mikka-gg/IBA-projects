package by.iba.gomel.tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.GenericsTask1;
import by.iba.gomel.IntegerFirstLastEq;
import by.iba.gomel.predicates.IntegerPredicate;
import by.iba.gomel.predicates.LongPredicate;

public class GenericsTask1Test {

    @Test
    public void testFirstEqualsLast() {
        final Collection<Integer> ic = Arrays.asList(1, 2, 3, 4, 1);
        Assert.assertTrue("Should return true", IntegerFirstLastEq.firstLastEq(ic));
    }

    @Test
    public void testFirstEqualsLast2Elements() {
        final Collection<Integer> ic = Arrays.asList(1, 1);
        Assert.assertTrue("Should return true", IntegerFirstLastEq.firstLastEq(ic));
    }

    @Test
    public void testFirstEqualsLastFail() {
        final Collection<Integer> ic = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertFalse("Should return false", IntegerFirstLastEq.firstLastEq(ic));
    }

    @Test
    public void testFirstEqualsLastLongValue() {
        final Collection<Long> lc = Arrays.asList(1L, 2L, 3L, 4L, 1L);
        Assert.assertFalse("Should return false, long elements",
                IntegerFirstLastEq.firstLastEq(lc));
    }

    @Test
    public void testOddInteger() {
        final Collection<Integer> ic = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals("Should return 3", 3,
                GenericsTask1.countElements(ic, new IntegerPredicate()));
    }

    @Test
    public void testOddLong() {
        final Collection<Long> lc = Arrays.asList(1L, 2L, 3L, 4L, 5L);
        Assert.assertEquals("Should return 3", 3,
                GenericsTask1.countElements(lc, new LongPredicate()));
    }

    @Test
    public void testOddNegativeInteger() {
        final Collection<Integer> ic = Arrays.asList(-5, 2, -1, 44, 5);
        Assert.assertEquals("Should return 3", 3,
                GenericsTask1.countElements(ic, new IntegerPredicate()));
    }

    @Test
    public void testOneDigitInteger() {
        final Collection<Integer> ic = Arrays.asList(1);
        Assert.assertEquals("Should return 1", 1,
                GenericsTask1.countElements(ic, new IntegerPredicate()));
    }
}
