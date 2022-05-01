package by.iba.gomel;

/**
 * Contains a year, title and number of pages of the book.
 */
public class Book {
    private final int    year;
    private final String title;
    protected int        numberOfPages;

    /**
     * Default constructor.
     *
     * @param numberOfPages
     *            - number of pages in the book.
     * @param title
     *            - title of the book.
     * @param year
     *            - year of the book.
     */
    public Book(final int numberOfPages, final String title, final int year) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }
}
