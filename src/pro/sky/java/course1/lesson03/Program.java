package pro.sky.java.course1.lesson03;

public class Program {
    public static void main(String[] args) {

        ////////// HOMEWORK 1 //////////
        System.out.println("HOMEWORK 1");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        int age = 20;
        boolean isMajority = age >= 18;
        boolean isNotMajority = age < 18;
        if (isMajority) {
            System.out.println("Поздравляем вас с тем, что вы полностью совершеннолетний человек!");
        }
        if (isNotMajority) {
            System.out.println("Вынуждены вас огорчить, но на данный момент вы не достигли возраста совершеннолетия. Нужно ещё немного подождать...");
        }


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        // Переменная age инициализирована в Задаче 1 Домашнего задания - 1
        if (age >= 7 && age < 18) {
            System.out.println("Вы ходите в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Вы закончили школу и можете поступить в университет");
        }
        if (age >= 24) {
            System.out.println("Вы окончили университет и пора бы отправиться на поиски первой работы");
        }


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        int capacity = 102;
        int sittingSeats = 60;
        int standingSeats = capacity - sittingSeats;

        int sittingSeatsUsed = 60;
        int standingSeatsUsed = 15;

        if (sittingSeatsUsed < sittingSeats) {
            System.out.println("Сидячие места есть");
        }
        if (sittingSeatsUsed == sittingSeats) {
            System.out.println("Сидячих мест нет");
        }
        if (standingSeatsUsed < standingSeats) {
            System.out.println("Стоячие места есть");
        }
        if (standingSeatsUsed == standingSeats) {
            System.out.println("Стоячих мест нет");
        }


        ////////// HOMEWORK 2 //////////
        System.out.println("\n\nHOMEWORK 2");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        // Переменная isMajority инициализирована в Задаче 1 Домашнего задания - 1
        if (isMajority) {
            System.out.println("Поздравляем вас с тем, что вы полностью совершеннолетний человек!");
        } else {
            System.out.println("Вынуждены вас огорчить, но на данный момент вы не достигли возраста совершеннолетия. Нужно ещё немного подождать...");
        }


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        // Переменная age инициализирована в Задаче 1 Домашнего задания - 1
        if (age >= 7 && age < 18) {
            System.out.println("Вы ходите в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Вы закончили школу и можете поступить в университет");
        } else if (age >= 24){
            System.out.println("Вы окончили университет и пора бы отправиться на поиски первой работы");
        }


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        // Переменные инициализированы в Задаче 3 Домашнего задания - 1
        if (sittingSeatsUsed < sittingSeats) {
            System.out.println("Сидячие места есть");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingSeatsUsed < standingSeats) {
            System.out.println("Стоячие места есть");
        } else {
            System.out.println("Стоячих мест нет");
        }


        ////////// HOMEWORK 3 //////////
        System.out.println("\n\nHOMEWORK 3");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        int year = 3;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад");
        } else if (year > 6 && year <= 18) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        } else if (year > 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему следует учиться в университете");
        } else if (year > 24){
            System.out.println("Если возраст человека равен " + year + ", то ему пора ходить на работу");
        }


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        // Переменная year инициализирована в Задаче 1 Домашнего задания - 3
        if (year <= 5) {
            System.out.println("Нам очень жаль, но тебе ещё нельзя кататься на аттракционе");
        } else if (year <= 14) {
            System.out.println("Тебе можно кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Тебе можно кататься одному на аттракционе");
        }


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        int one = 10;
        int two = -7;
        int three = 888;

        if (one > two && one > three) {
            System.out.println("Из трёх заданных чисел (" + one + ", " + two + ", " + three + "), большим является число " + one);
        } else if (two > one && two > three) {
            System.out.println("Из трёх заданных чисел (" + one + ", " + two + ", " + three + "), большим является число " + two);
        } else {
            System.out.println("Из трёх заданных чисел (" + one + ", " + two + ", " + three + "), большим является число " + three);
        }
    }
}
