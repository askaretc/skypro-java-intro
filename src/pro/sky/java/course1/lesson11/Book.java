package pro.sky.java.course1.lesson11;

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
        this.publishingYear = publishingYear;
    }
}
