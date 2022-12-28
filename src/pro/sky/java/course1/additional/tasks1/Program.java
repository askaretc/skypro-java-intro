package pro.sky.java.course1.additional.tasks1;

public class Program {
    public static void main(String[] args) {

        /////////// Task 6 //////////
        System.out.println("Task 6:");

        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result *= -1;
        System.out.println(result);


        /////////// Task 7 //////////
        System.out.println("\nTask 7:");

        a = 5;
        b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);


        /////////// Task 8 //////////
        System.out.println("\nTask 8:");

        a = 789;
        b = ((a % 100) - (a % 10)) / 10;
        System.out.println("b = " + b);
    }
}
