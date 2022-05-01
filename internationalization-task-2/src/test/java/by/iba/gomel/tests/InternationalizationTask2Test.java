package by.iba.gomel.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.InternationalizationTask2App;

public class InternationalizationTask2Test {

    private static final Locale       AUSTRIA_LOCALE = new Locale("de", "AT");
    private static final Locale       BELARUS_LOCALE = new Locale("be", "BY");
    private static final Locale       UK_LOCALE      = new Locale("en", "GB");

    private static final List<String> AUSTRIA        = Arrays.asList(
            InternationalizationTask2Test.AUSTRIA_LOCALE.getDisplayCountry(Locale.ENGLISH),
            InternationalizationTask2Test.AUSTRIA_LOCALE.getDisplayCountry(Locale.ITALIAN),
            InternationalizationTask2Test.AUSTRIA_LOCALE.getDisplayCountry(Locale.GERMAN),
            InternationalizationTask2Test.AUSTRIA_LOCALE.getDisplayCountry(Locale.FRENCH));
    private static final List<String> BELARUS        = Arrays.asList(
            InternationalizationTask2Test.BELARUS_LOCALE.getDisplayCountry(Locale.ENGLISH),
            InternationalizationTask2Test.BELARUS_LOCALE.getDisplayCountry(Locale.ITALIAN),
            InternationalizationTask2Test.BELARUS_LOCALE.getDisplayCountry(Locale.GERMAN),
            InternationalizationTask2Test.BELARUS_LOCALE.getDisplayCountry(Locale.FRENCH));
    private static final List<String> UK             = Arrays.asList(
            InternationalizationTask2Test.UK_LOCALE.getDisplayCountry(Locale.ENGLISH),
            InternationalizationTask2Test.UK_LOCALE.getDisplayCountry(Locale.ITALIAN),
            InternationalizationTask2Test.UK_LOCALE.getDisplayCountry(Locale.GERMAN),
            InternationalizationTask2Test.UK_LOCALE.getDisplayCountry(Locale.FRENCH));

    @Test
    public void testAustria() {
        Assert.assertEquals(
                "The method should return Austria in English, Italian, German and Frecnh",
                InternationalizationTask2Test.AUSTRIA,
                InternationalizationTask2App.getCountryIn4Languages("Austria"));
    }

    @Test
    public void testBelarus() {
        Assert.assertEquals(
                "The method should return Belarus in English, Italian, German and Frecnh",
                InternationalizationTask2Test.BELARUS,
                InternationalizationTask2App.getCountryIn4Languages("Belarus"));
    }

    @Test
    public void testUK() {
        Assert.assertEquals(
                "The method should return United Kingdom in English, Italian, German and Frecnh",
                InternationalizationTask2Test.UK,
                InternationalizationTask2App.getCountryIn4Languages("United Kingdom"));
    }
}
