package pro.sky.java.course1.lesson6;

public class Program {
    public static void main(String[] args) {

        ////////// HOMEWORK 1 //////////
        System.out.println("HOMEWORK 1");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        int monthlySaving = 15_000;
        int totalSum = 0;
        int monthNumber = 1;
        while (totalSum < 2_459_000) {
            totalSum += totalSum / 100;
            totalSum += monthlySaving;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + totalSum + " рублей");
            monthNumber++;
        }


        ////////// Task 2 //////////
        System.out.println("\n\nTask 2:");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }


        ////////// Task 3 //////////
        System.out.println("\n\n\nTask 3:");

        int population = 12_000_000;
        int birthRateAYearPerThousandPeople = 17;
        int mortalityRateAYearPerThousandPeople = 8;
        int yearNumber = 1;
        while (yearNumber <= 10) {
            population += (population / 1000) * (birthRateAYearPerThousandPeople - mortalityRateAYearPerThousandPeople);
            System.out.println("Год " + yearNumber + ", численность населения составляет " + population);
            yearNumber++;
        }


        ////////// HOMEWORK 2 //////////
        System.out.println("\n\nHOMEWORK 2");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");

        int depositInterest = 7;
        int deposit = 15_000;
        int month = 1;
        while (deposit < 12_000_000) {
            deposit += (depositInterest * deposit) / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            month++;
        }


        ////////// Task 2 //////////
        System.out.println("\n\nTask 2:");

        // Возвращаем исходные значения переменным
        deposit = 15_000;
        month = 1;
        while (deposit < 12_000_000) {
            // Переменная depositInterest инициализирована в Задаче 1 (Домашнее задание - 2)
            deposit += (depositInterest * deposit) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
            month++;
        }


        ////////// Task 3 //////////
        System.out.println("\n\nTask 3:");

        int yearsAmount = 9;
        int monthsAmount = yearsAmount * 12;
        // Возвращаем исходные значения переменным
        deposit = 15_000;
        month = 1;
        while (month <= monthsAmount) {
            // Переменная depositInterest инициализирована в Задаче 1 (Домашнее задание - 2)
            deposit += (depositInterest * deposit) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
            month++;
        }


        ////////// Task 4 //////////
        System.out.println("\n\nTask 4:");

        int friday = 7;     // номер первой пятницы месяца
        int daysAmountInAMonth = 31;    // количество дней в месяце
        for (; friday <= daysAmountInAMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }
}
