package pro.sky.java.course1.lesson05;

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


        ////////// HOMEWORK 3 //////////
        System.out.println("\n\nHOMEWORK 3");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        int money = 29_000;
        int total = 0;
        String month = "";
        char rubleSymbol = '₽';
        for (int i = 1; i <= 12; i++) {
            total += money;
            switch (i) {
                case 1:
                    month = "Январь";
                    break;
                case 2:
                    month = "Февраль";
                    break;
                case 3:
                    month = "Март";
                    break;
                case 4:
                    month = "Апрель";
                    break;
                case 5:
                    month = "Май";
                    break;
                case 6:
                    month = "Июнь";
                    break;
                case 7:
                    month = "Июль";
                    break;
                case 8:
                    month = "Август";
                    break;
                case 9:
                    month = "Сентябрь";
                    break;
                case 10:
                    month = "Октябрь";
                    break;
                case 11:
                    month = "Ноябрь";
                    break;
                case 12:
                    month = "Декабрь";
                    break;
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + rubleSymbol);
        }


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        int monthlySaving = 29_000;
        int totalSum = 0;
        String monthName = "";
        for (int i = 1; i <= 12; i++) {
            totalSum += totalSum / 100;
            totalSum += monthlySaving;
            switch (i) {
                case 1:
                    monthName = "Январь";
                    break;
                case 2:
                    monthName = "Февраль";
                    break;
                case 3:
                    monthName = "Март";
                    break;
                case 4:
                    monthName = "Апрель";
                    break;
                case 5:
                    monthName = "Май";
                    break;
                case 6:
                    monthName = "Июнь";
                    break;
                case 7:
                    monthName = "Июль";
                    break;
                case 8:
                    monthName = "Август";
                    break;
                case 9:
                    monthName = "Сентябрь";
                    break;
                case 10:
                    monthName = "Октябрь";
                    break;
                case 11:
                    monthName = "Ноябрь";
                    break;
                case 12:
                    monthName = "Декабрь";
                    break;
            }
            System.out.println("Месяц " + monthName + ", сумма накоплений равна " + totalSum + rubleSymbol);
        }
    }
}
