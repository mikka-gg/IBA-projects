package by.iba.gomel;

/**
 * This class represents a book with title, year and number of pages.
 */
public class Book {
    private final int    numberOfPages;
    private final String title;
    private final int    year;

    /**
     * Default constructor.
     *
     * @param numberOfPages
     *            - number of pages.
     * @param title
     *            - title.
     * @param year
     *            - year of publication.
     */
    public Book(final int numberOfPages, final String title, final int year) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.year = year;
    }

    /**
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return this.year;
    }

}
