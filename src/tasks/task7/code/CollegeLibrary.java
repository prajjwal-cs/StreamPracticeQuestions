package tasks.task7.code;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollegeLibrary {
    public List<Book> getListOfExpensiveBooks(Set<Book> books) {
        return books.stream().filter(book -> book.getBookPrice() >= 5000.0).distinct()
                .toList();
    }

    public Book findBookDetailsByISBN(List<Book> books, String ISBN) {
        return (Book) books.stream().filter(book -> book.getIsbnNumber().equals(ISBN));
    }
}
