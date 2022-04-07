package tasks.task8.code;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BooksHelper {
    public List<Book> findAllBooksOnSubject(Set<Book> books, String subject) {
        return books.stream().filter(book -> book.getSubject().equals(subject)).distinct().toList();
    }

    public List<Book> sortBooks(Set<Book> books) {
        Comparator<Book> comparator = (b1, b2) -> b1.getSubject().compareTo(b2.getSubject());
        return books.stream().sorted(comparator).toList();
    }
}
