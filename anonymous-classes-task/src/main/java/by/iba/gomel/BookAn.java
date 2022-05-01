package by.iba.gomel;

/**
 * This class creates an array of size N and provides access to its data using the inner Page class
 * and the getPageContent() method.
 *
 * The static inner class Contents has the navigateToPage() method that navigates to some page.
 *
 * The inner class Page contains page number and its content.
 */
public class BookAn {
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
    public BookAn(final int numberOfPages) {
        this.pages = new Page[numberOfPages];
        for (int i = 0; i < this.pages.length; i++) {
            final BookAn.Page page = this.new Page(i);
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
    public String getPageContent(final BookAn book, final int pageNumber) {
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
        public int navigateToPage(final BookAn book, final int pageNumber) {
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
         * Constructor to create an empty page with default (English) translation.
         *
         * @param pageNumber
         *            - page number
         */
        public Page(final int pageNumber) {
            final Translatable translation = new Translatable() {

                @Override
                public void print() {
                    // Do nothing
                }

                @Override
                public String translate(final String content) {
                    return "[EN] " + content;
                }

            };
            this.pageNumber = pageNumber;
            this.content = translation.translate("No content");
        }

        /**
         * Constructor to create a page with a content and default (English) translation and fill
         * the array with it.
         *
         * @param pageNumber
         *            - page number
         * @param content
         *            - content
         */
        public Page(final int pageNumber, final String content) {
            final Translatable translation = new Translatable() {

                @Override
                public void print() {
                    // Do nothing
                }

                @Override
                public String translate(final String content) {
                    return "[EN] " + content;
                }

            };
            this.pageNumber = pageNumber;
            this.content = content;
            for (final Page bookPage : BookAn.this.pages) {
                if (pageNumber == bookPage.pageNumber) {
                    bookPage.content = translation.translate(content);
                }
            }
        }

        /**
         * Constructor to create a page with a content and custom translation and fill the array
         * with it.
         *
         * @param pageNumber
         *            - page number
         * @param content
         *            - content
         * @param translation
         *            - translation provided by an anonymous class
         */
        public Page(final int pageNumber, final String content, final Translatable translation) {
            this.pageNumber = pageNumber;
            this.content = content;
            for (final Page bookPage : BookAn.this.pages) {
                if (pageNumber == bookPage.pageNumber) {
                    bookPage.content = translation.translate(content);
                }
            }
        }

        /**
         * Sonar fix for final field.
         *
         * @param content
         *            - content
         */
        public void setContent(final String content) {
            this.content = content;
        }
    }

    /**
     * Interface for translating and printing some content.
     */
    public interface Translatable {
        /**
         * Not used.
         */
        void print();

        /**
         * Takes some content and adds a language marker at the beginning.
         *
         * @param content
         *            - content.
         * @return [language marker] + content.
         */
        String translate(final String content);
    }
}
