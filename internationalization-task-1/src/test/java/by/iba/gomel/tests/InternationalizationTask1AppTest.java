package by.iba.gomel.tests;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.iba.gomel.InternationalizationTask1App;

public class InternationalizationTask1AppTest {
    private static List<String> multicityClock;

    @BeforeClass
    public static void fillListWithDateTime() {
        InternationalizationTask1AppTest.multicityClock = InternationalizationTask1App
                .timezone(ZonedDateTime.of(LocalDateTime.of(2022, Month.MARCH, 5, 17, 54),
                        ZoneId.of("Europe/Minsk")));
    }

    @Test
    public void testBerlinDateTime() {
        Assert.assertEquals("The date and time should be for Berlin",
                "05-03-2022 15:54:00 - Europe/Berlin",
                InternationalizationTask1AppTest.multicityClock.get(3));
    }

    @Test
    public void testLondonDateTime() {
        Assert.assertEquals("The date and time should be for London",
                "05-03-2022 14:54:00 - Europe/London",
                InternationalizationTask1AppTest.multicityClock.get(1));
    }

    @Test
    public void testParisDateTime() {
        Assert.assertEquals("The date and time should be for Paris",
                "05-03-2022 15:54:00 - Europe/Paris",
                InternationalizationTask1AppTest.multicityClock.get(2));
    }

    @Test
    public void testWashingtonDateTime() {
        Assert.assertEquals("The date and time should be for New_York",
                "03-05-2022 09:54:00 AM - America/New_York",
                InternationalizationTask1AppTest.multicityClock.get(0));
    }
}
