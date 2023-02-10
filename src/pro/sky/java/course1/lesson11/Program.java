package pro.sky.java.course1.lesson11;

public class Program {

    private static final Book[] booksArray = new Book[10];

    public static void main(String[] args) {

        Author author1 = new Author("Джордж", "Мартин");
        Author author2 = new Author("Анджей", "Сапковский");

        Book book1 = new Book("Игра престолов", author1, 2019);
        Book book2 = new Book("Ведьмак", author2, 2020);

        book2.setPublishingYear(2021);

        //System.out.println(book1.getName() + ". " + book1.getAuthorFullName() + ", " + book1.getPublishingYear());
        //System.out.println(book2.getName() + ". " + book2.getAuthorFullName() + ", " + book2.getPublishingYear());

        setBookToArray(book1);
        setBookToArray(book2);

        printAllBooks();
    }


    private static void setBookToArray(Book book) {
        booksArray[getIndexOfFreeElement()] = book;
    }

    private static int getIndexOfFreeElement() {
        int i = 0;
        for (;i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("Не удалось записать книгу! Массив переполнен.");
    }


    public static void printAllBooks() {
        if(!checkAllElementsIsNull()) {
            for (Book book : booksArray) {
                if (book != null) {
                    System.out.println(book.getAuthorFullName() + ": " + book.getName() + ": " + book.getPublishingYear());
                }
            }
        }
    }

    private static boolean checkAllElementsIsNull() {
        int j = 0;
        for (Book book : booksArray) {
            if (book == null) {
                j++;
            }
        }
        if(j == booksArray.length){
            throw new RuntimeException("Нечего выводить! Массив пустой.");
        }
        return false;
    }
}
