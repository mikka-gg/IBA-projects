package by.iba.gomel;

/**
 * This class creates an array of size N.
 *
 * Sets a bookmark using a bookmark() method and local class Bookmark.
 */
public class BookLc {
    // a bookmark
    protected int        currentPageNumber;
    protected String     comment;
    private final Page[] pages;

    /**
     * Default constructor. Creates an array of size numberOfPage, fills it with a Page objects
     * (sets each object's page number in ascending order from 0 to numberOfPage).
     *
     * @param numberOfPages
     *            - number of pages in the book.
     */
    public BookLc(final int numberOfPages) {
        this.pages = new Page[numberOfPages];
        for (int i = 0; i < this.pages.length; i++) {
            final BookLc.Page page = this.new Page(i);
            this.pages[i] = page;
        }
    }

    /**
     * Contains a local class Bookmark that sets a bookmark using the setBookmark() method.
     *
     * @param pageNumber
     *            - page number.
     * @param comment
     *            - comment to the bookmark.
     * @return a message that bookmark is set to the pageNumber with the comment.
     */
    public String bookmark(final int pageNumber, final String comment) {
        /**
         * Has the setBookmark() method to set a bookmark.
         */
        class Bookmark {
            /**
             * If the array has the pageNumber - sets pageNumber and comment to the
             * currentPageNumber and comment fields respectively.
             *
             * @param pageNumber
             *            - page number.
             * @param comment
             *            - comment to the bookmark.
             */
            public void setBookmark(final int pageNumber, final String comment) {
                for (final Page page : BookLc.this.pages) {
                    if (page.pageNumber == pageNumber) {
                        BookLc.this.currentPageNumber = pageNumber;
                        BookLc.this.comment = comment;
                        break;
                    }
                }
            }
        }
        final Bookmark bookmark = new Bookmark();
        bookmark.setBookmark(pageNumber, comment);
        return "The bookmark is set to page " + BookLc.this.currentPageNumber
                + " with the comment - " + BookLc.this.comment;
    }

    /**
     * Not used.
     *
     * @param book
     *            - Not used.
     * @param pageNumber
     *            - Not used.
     * @return - Not used.
     */
    public String getPageContent(final BookLc book, final int pageNumber) {
        return "" + book + pageNumber;
    }

    /**
     * Not used.
     */
    public static final class Contents {
        /**
         * Not used.
         *
         * @return -1
         */
        public int navigateToPage() {
            return -1;
        }
    }

    /**
     * Book page, contains page number and content.
     */
    public final class Page {
        private final int    pageNumber;
        private final String content;

        /**
         * Constructor to create an empty page.
         *
         * @param pageNumber
         *            - page number
         */
        public Page(final int pageNumber) {
            BookLc.this.comment = "No bookmark";
            BookLc.this.currentPageNumber = -1;
            this.pageNumber = pageNumber;
            this.content = "No content";
        }

        /**
         * Fix for unused field.
         *
         * @return content
         */
        public String getContent() {
            return this.content;
        }
    }
}
