package tasks.task7.code;

import java.util.Objects;

public class Book {
    private final String IsbnNumber;
    private final String bookName;
    private String bookAuthor;
    private double bookPrice;

    public Book() {
        this.IsbnNumber = null;
        this.bookName = null;
        this.bookAuthor = null;
        this.bookPrice = 0.0;
    }

    public Book(String isbnNumber, String bookName, String bookAuthor, double bookPrice) {
        IsbnNumber = isbnNumber;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    public String getIsbnNumber() {
        return IsbnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.bookPrice, bookPrice) == 0 && Objects.equals(IsbnNumber, book.IsbnNumber) && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IsbnNumber, bookName, bookAuthor, bookPrice);
    }

    @Override
    public String toString() {
        return "Book{" +
                "IsbnNumber='" + IsbnNumber + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
