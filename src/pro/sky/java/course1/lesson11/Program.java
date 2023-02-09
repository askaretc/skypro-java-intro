package pro.sky.java.course1.lesson11;

public class Program {
    public static void main(String[] args) {

        Author author1 = new Author("Джордж", "Мартин");
        Author author2 = new Author("Анджей", "Сапковский");

        Book book1 = new Book("Игра престолов", author1, 2019);
        Book book2 = new Book("Ведьмак", author2, 2020);

        book2.setPublishingYear(2021);

        System.out.println(book1.getName() + ". " + book1.getAuthorFullName() + ", " + book1.getPublishingYear());
        System.out.println(book2.getName() + ". " + book2.getAuthorFullName() + ", " + book2.getPublishingYear());
    }
}
