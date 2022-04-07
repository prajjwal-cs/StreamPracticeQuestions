package tasks.task8.code;

import java.util.Objects;

public class Book {
    private final String isbnNumber;
    private final String name;
    private String author;
    private String subject;

    public Book() {
        this.isbnNumber = null;
        this.name = null;
        this.author = null;
        this.subject = null;
    }

    public Book(String isbnNumber, String name, String author, String subject) {
        this.isbnNumber = isbnNumber;
        this.name = name;
        this.author = author;
        this.subject = subject;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbnNumber, book.isbnNumber) && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(subject, book.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbnNumber, name, author, subject);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
