package pro.sky.java.course1.lesson11;

import java.util.Objects;

public class Book {

    private final String name;
    private final Author authorFullName;
    private int publishingYear;


    public Book(String name, Author authorFullName, int publishingYear) {
        this.name = name;
        this.authorFullName = authorFullName;
        this.publishingYear = publishingYear;
    }


    public String getName() {
        return name;
    }

    public String getAuthorFullName() {
        return authorFullName.getFirstName() + " " + authorFullName.getLastName();
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 0) {
            throw new IllegalArgumentException("The year of publication cannot be negative.");
        }
        this.publishingYear = publishingYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && authorFullName.equals(book.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorFullName);
    }

    @Override
    public String toString() {
        return authorFullName.toString() + ": " + name + ": " + publishingYear;
    }
}
