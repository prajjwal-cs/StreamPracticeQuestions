package tasks.task8.main;

import com.github.javafaker.Faker;
import tasks.task8.code.Book;
import tasks.task8.code.BooksHelper;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Task8Main {
    private static Book createFakeBooks() {
        Faker faker = new Faker(new Locale("en-IND"));
        return new Book(faker.idNumber().valid(), faker.book().title(), faker.book().author(),
                faker.educator().course());
    }

    private static Set<Book> createSetOfFakeBooks(int number) {
        Set<Book> fakeBookSet = new HashSet<>();
        for (int index = 0; index < number; index++) {
            fakeBookSet.add(createFakeBooks());
        }
        return fakeBookSet;
    }
    public static void main(String[] args) {
        BooksHelper booksHelper = new BooksHelper();
        Set<Book> newBooks = createSetOfFakeBooks(5);

    }
}
