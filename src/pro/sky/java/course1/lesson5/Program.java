package pro.sky.java.course1.lesson5;

public class Program {
    public static void main(String[] args) {

        ////////// HOMEWORK 1 //////////
        System.out.println("HOMEWORK 1");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        for (int i = 1; i <= 10; i++)
            System.out.println(i);


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        for (int i = 10; i >= 1; i--)
            System.out.println(i);


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        for (int i = 0; i <= 17; i += 2)
            System.out.println(i);


        ////////// Task 4 //////////
        System.out.println("\nTask 4:");

        for (int i = 10; i >= -10; i--)
            System.out.println(i);


        ////////// HOMEWORK 2 //////////
        System.out.println("\n\nHOMEWORK 2");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        for (int i = 7; i <= 98; i += 7)
            System.out.println(i);


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        for (int i = 1; i <= 512; i *= 2)
            System.out.println(i);
    }
}
