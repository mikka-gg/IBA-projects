package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Book;

public class BookTest {

    @Test
    public void testSortByTitle() {

        final ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(150, "Poetry", 2015));
        books.add(new Book(90, "Literature", 2009));
        books.add(new Book(130, "Chemistry", 2013));

        Collections.sort(books, (p1, p2) -> {
            return p1.getTitle().compareTo(p2.getTitle());
        });

        // TEST
        final String[] rigthOrder = {"Chemistry", "Literature", "Poetry"};
        for (int i = 0; i < books.size(); i++) {
            Assert.assertEquals("The ArrayList should be sorted in ascending order by title",
                    rigthOrder[i], books.get(i).getTitle());
        }
    }

    @Test
    public void testSortByYear() {

        final ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(150, "Poetry", 2015));
        books.add(new Book(90, "Literature", 2009));
        books.add(new Book(130, "Chemistry", 2013));

        Collections.sort(books, (p1, p2) -> {
            return Integer.compare(p2.getYear(), p1.getYear());
        });

        // TEST
        final int[] rigthOrder = {2015, 2013, 2009};
        for (int i = 0; i < books.size(); i++) {
            Assert.assertEquals("The ArrayList should be sorted in deascending order by year",
                    rigthOrder[i], books.get(i).getYear());
        }
    }
}
