package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.SamsungMonitor;

/**
 * SamsungMonitorTest
 */
public class SamsungMonitorTest {

    final SamsungMonitor samsungMonitor = new SamsungMonitor();

    /**
     * testBrightnessDecrement
     */
    @Test
    public void testBrightnessDecrement() {
        Assert.assertEquals("Should return decremented brightness", 30,
                this.samsungMonitor.brightnessDecrement(20));
    }

    /**
     * testBrightnessIncrement
     */
    @Test
    public void testBrightnessIncrement() {
        Assert.assertEquals("Should return incremented brightness", 70,
                this.samsungMonitor.brightnessIncrement(20));
    }

    /**
     * testChangeResolution
     */
    @Test
    public void testChangeResolution() {
        Assert.assertEquals("Should return resolution", 2160,
                this.samsungMonitor.changeResolution(2160));
    }

}
