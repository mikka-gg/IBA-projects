package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RoomLighting;

/**
 * RoomLightingTest
 */
public class RoomLightingTest {

    /**
     * testBalb1Switch
     */
    @Test
    public void testBalb1Switch() {
        Assert.assertEquals("Should return On", "On", RoomLighting.balb1Switch("On"));
    }

    /**
     * testBalb2Switch
     */
    @Test
    public void testBalb2Switch() {
        Assert.assertEquals("Should return Off", "Off", RoomLighting.balb2Switch("Off"));
    }

}
