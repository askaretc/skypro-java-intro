package pro.sky.java.course1.lesson11;

public class Program {

    //private static final Book[] booksArray = new Book[10];

    public static void main(String[] args) {

        //Author author1 = new Author("George", "Martin");
        //Author author2 = new Author("Andrzej", "Sapkowski");

        //Book book1 = new Book("Game of Thrones", author1, 2019);
        //Book book2 = new Book("The Witcher", author2, 2020);

        //book2.setPublishingYear(2021);

        //System.out.println(book1.getName() + ". " + book1.getAuthorFullName() + ", " + book1.getPublishingYear());
        //System.out.println(book2.getName() + ". " + book2.getAuthorFullName() + ", " + book2.getPublishingYear());

        //setBookToArray(book1);
        //setBookToArray(book2);

        //printAllBooks();

        //Library library = new Library(10);

        //library.addBook(book1);
        //library.addBook(book2);

        //library.printInformationAboutBook("The Witcher");
        //library.setPublishingYearByName("The Witcher", 2022);

        //library.printAllBooks();

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));
        System.out.println(stephenKing);
        System.out.println(levTolstoy);
        System.out.println("==============================");
        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);
        System.out.println("==============================");
        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
    }


    /*private static void setBookToArray(Book book) {
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
    }*/
}
