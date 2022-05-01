package by.iba.gomel;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Has the getCountryIn4Languages() method to display country from the NumberFormat locales in
 * English, Italian, German and French.
 */
public final class InternationalizationTask2App {

    /**
     * Default constructor.
     */
    private InternationalizationTask2App() {

    }

    /**
     * Takes country name and searches it in the NumberFormat locales, if found - adds it to the
     * list in 4 languages.
     *
     * @param countryName
     *            - String, country to search for.
     * @return the List of String, country name in 4 languages.
     */
    public static List<String> getCountryIn4Languages(final String countryName) {

        final Locale[] countries = NumberFormat.getAvailableLocales();
        final List<String> countryLocalization = new ArrayList<>();

        for (final Locale country : countries) {
            if (country.getDisplayCountry().equals(countryName)) {

                countryLocalization.add(country.getDisplayCountry());
                countryLocalization.add(country.getDisplayCountry(Locale.ITALIAN));
                countryLocalization.add(country.getDisplayCountry(Locale.GERMAN));
                countryLocalization.add(country.getDisplayCountry(Locale.FRENCH));
                break;

            }
        }

        return countryLocalization;
    }

}
