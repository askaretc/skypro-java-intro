package pro.sky.java.course1.lesson11;

public class Library {

    private final Book[] booksArray;


    public Library(int booksAmount) {
        booksArray = new Book[booksAmount];
    }


    public void setBookToLibrary(Book book) {
        booksArray[getIndexOfFreeElement()] = book;
    }

    private int getIndexOfFreeElement() {
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("The book could not be recorded! The array is full.");
    }


    public void printAllBooks() {
        if (!checkAllElementsIsNull()) {
            for (Book book : booksArray) {
                if (book != null) {
                    System.out.println(book.getAuthorFullName() + ": " + book.getName() + ": " + book.getPublishingYear());
                }
            }
        }
    }

    private boolean checkAllElementsIsNull() {
        int j = 0;
        for (Book book : booksArray) {
            if (book == null) {
                j++;
            }
        }
        if (j == booksArray.length) {
            throw new RuntimeException("There is nothing to output! The array is empty.");
        }
        return false;
    }


    public void printInformationAboutBook(String bookName) {
        System.out.println(booksArray[getIndexOfBook(bookName)].getName() + " by " + booksArray[getIndexOfBook(bookName)].getAuthorFullName() + " was published in " + booksArray[getIndexOfBook(bookName)].getPublishingYear());
    }

    private int getIndexOfBook(String bookName) {
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] != null) {
                if (booksArray[i].getName().equals(bookName.trim())) {
                    return i;
                }
            }
        }
        throw new RuntimeException("There is no book with this name.");
    }

    public void setPublishingYearByName(String bookName, int publishingYear) {
        booksArray[getIndexOfBook(bookName)].setPublishingYear(publishingYear);
    }
}
