package by.iba.gomel;

/**
 * This class creates an array of size N and provides access to its data using the inner Page class
 * and the getPageContent() method.
 *
 * The static inner class Contents has the navigateToPage() method that navigates to some page.
 *
 * The inner class Page contains page number and its content.
 */
public class Book {
    // a bookmark
    protected int        currentPageNumber = -1;
    private final Page[] pages;

    /**
     * Default constructor. Creates an array of size numberOfPage, fills it with a Page objects
     * (sets each object's page number in ascending order from 0 to numberOfPage).
     *
     * @param numberOfPages
     *            - number of pages in the book.
     */
    public Book(final int numberOfPages) {
        this.pages = new Page[numberOfPages];
        for (int i = 0; i < this.pages.length; i++) {
            final Book.Page page = this.new Page(i);
            this.pages[i] = page;
        }
    }

    /**
     * Finds some page number in the given book and returns its content.
     *
     * @param book
     *            - book to search in.
     * @param pageNumber
     *            - page number to search for.
     * @return content of the book or Page is not found, if the page number wasn't found.
     */
    public String getPageContent(final Book book, final int pageNumber) {
        for (final Page page : book.pages) {
            if (page.pageNumber == pageNumber) {
                return page.content;
            }
        }
        return "Empty page or not found";
    }

    /**
     * Finds some page in the book.
     */
    public static final class Contents {

        /**
         * Finds a page in the book by its page number.
         *
         * @param book
         *            - where to search.
         * @param pageNumber
         *            - what to search.
         * @return the page number or -1 if page is not found.
         */
        public int navigateToPage(final Book book, final int pageNumber) {
            for (final Page bookPage : book.pages) {
                if (pageNumber == bookPage.pageNumber) {
                    book.currentPageNumber = pageNumber;
                    return pageNumber;
                }
            }
            return -1;
        }
    }

    /**
     * Book page, contains page number and content.
     */
    public final class Page {
        private final int pageNumber;
        private String    content;

        /**
         * Constructor to create an empty page.
         *
         * @param pageNumber
         *            - page number
         */
        public Page(final int pageNumber) {
            this.pageNumber = pageNumber;
            this.content = "No content";
        }

        /**
         * Constructor to create a page with a content and fill the array with it.
         *
         * @param pageNumber
         *            - page number
         * @param content
         *            - content
         */
        public Page(final int pageNumber, final String content) {
            this.pageNumber = pageNumber;
            this.content = content;
            for (final Page bookPage : Book.this.pages) {
                if (pageNumber == bookPage.pageNumber) {
                    bookPage.setContent(content);
                }
            }
        }

        /**
         * Fix for final field content.
         * 
         * @param content
         *            - content
         */
        public void setContent(final String content) {
            this.content = content;
        }
    }
}
