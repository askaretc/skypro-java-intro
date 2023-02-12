package pro.sky.java.course1.lesson02;

public class Program {
    public static void main(String[] args) {

        /////////// Task 1 //////////
        System.out.println("Task 1:");

        byte myByte = 127; // from -128 to 127
        short myShort = 32760; // from -32768 to 32767
        int myInt = 2147483640; // from -2147483648 to 2147483647
        long myLong = 922337203685477580L; // from -9223372036854775808 to 9223372036854775807
        double myDouble = 100.70; // from -1.7E + 308 to 1.7Е + 308
        float myFloat = 3000.8f; // from -3.4E + 38 to 3.4E + 38

        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        float x1 = 27.12f;
        long x2 = 987_678_965_549L;
        double x3 = 2.786;
        boolean x4 = false;
        char x5 = 569;
        short x6 = -159;
        int x7 = 27897;
        byte x8 = 67;

        System.out.println("Значение переменной x1: " + x1);
        System.out.println("Значение переменной x2: " + x2);
        System.out.println("Значение переменной x3: " + x3);
        System.out.println("Значение переменной x4: " + x4);
        System.out.println("Значение переменной x5: " + x5);
        System.out.println("Значение переменной x6: " + x6);
        System.out.println("Значение переменной x7: " + x7);
        System.out.println("Значение переменной x8: " + x8);


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        int studentsGroup1 = 23;
        int studentsGroup2 = 27;
        int studentsGroup3 = 30;
        int paper = 480;
        int personalPaper = paper / (studentsGroup1 + studentsGroup2 + studentsGroup3);

        System.out.println("На каждого ученика рассчитано " + personalPaper + " листов бумаги");


        ////////// Task 4 //////////
        System.out.println("\nTask 4:");

        int bottles = 16;
        int workingTime = 2;
        int productionCapacityMinute = bottles / workingTime;
        int productionCapacityTwentyMinutes = 20 * productionCapacityMinute;
        int productionCapacityDay = 1440 * productionCapacityMinute;
        int productionCapacityThreeDays = 3 * productionCapacityDay;
        int productionCapacityMonth = 30 * productionCapacityDay;

        System.out.println("За 20 минут машина произвела " + productionCapacityTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + productionCapacityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productionCapacityThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productionCapacityMonth + " штук бутылок");


        ////////// Task 5 //////////
        System.out.println("\nTask 5:");

        int allPaintCans = 120;
        int whitePaintCansPerClassroom = 2;
        int brownPaintCansPerClassroom = 4;
        int allPaintCansPerClassroom = whitePaintCansPerClassroom + brownPaintCansPerClassroom;
        int classroomsAmount = allPaintCans / allPaintCansPerClassroom;
        int whitePaintCansPerSchool = whitePaintCansPerClassroom * classroomsAmount;
        int brownPaintCansPerSchool = brownPaintCansPerClassroom * classroomsAmount;

        System.out.println("В школе, где " + classroomsAmount + " классов, нужно " + whitePaintCansPerSchool + " банок белой краски и " + brownPaintCansPerSchool + " банок коричневой краски");


        ////////// Task 6 //////////
        System.out.println("\nTask 6:");

        double bananasAmount = 5;
        double bananaWeight = 80;
        double milkAmount = 200;
        double milkWeightHundred = 105;
        double milkWeightOne = milkWeightHundred / 100;
        double iceCreamAmount = 2;
        double iceCreamWeight = 100;
        double eggsAmount = 4;
        double eggWeight = 70;
        double shakeWeightGram = bananasAmount * bananaWeight + milkAmount * milkWeightOne + iceCreamAmount * iceCreamWeight + eggsAmount * eggWeight;
        double shakeWeightKilo = shakeWeightGram / 1000;

        System.out.println("Общий вес спорт-завтрака: " + shakeWeightKilo + " кг");


        ////////// Task 7 //////////
        System.out.println("\nTask 7:");

        int requiredWeightKilo = 7;
        int requiredWeightPerDay1 = 250;
        int requiredWeightPerDay2 = 500;
        int requiredWeightGram = requiredWeightKilo * 1000;
        int numberOfDays1 = requiredWeightGram / requiredWeightPerDay1;
        int numberOfDays2 = requiredWeightGram / requiredWeightPerDay2;
        int averageValueOfDays = (numberOfDays1 + numberOfDays2) / 2;

        System.out.println("Если терять в весе по 250 грамм в день, то потребуется " + numberOfDays1 + " дней, чтобы сбросить 7 кг");
        System.out.println("Если терять в весе по 500 грамм в день, то потребуется " + numberOfDays2 + " дней, чтобы сбросить 7 кг");
        System.out.println("В среднем может потребоваться " + averageValueOfDays + " дней, чтобы добиться результата похудения (если терять в весе от 250 до 500 грамм в день)");


        ////////// Task 8 //////////
        System.out.println("\nTask 8:");

        int currentSalaryWorker1 = 67_760;
        int currentSalaryWorker2 = 83_690;
        int currentSalaryWorker3 = 76_230;
        int bonusWorker1 = (currentSalaryWorker1 * 10) / 100;
        int bonusWorker2 = (currentSalaryWorker2 * 10) / 100;
        int bonusWorker3 = (currentSalaryWorker3 * 10) / 100;
        int newSalaryWorker1 = currentSalaryWorker1 + bonusWorker1;
        int newSalaryWorker2 = currentSalaryWorker2 + bonusWorker2;
        int newSalaryWorker3 = currentSalaryWorker3 + bonusWorker3;
        int annualCurrentSalaryWorker1 = currentSalaryWorker1 * 12;
        int annualCurrentSalaryWorker2 = currentSalaryWorker2 * 12;
        int annualCurrentSalaryWorker3 = currentSalaryWorker3 * 12;
        int annualNewSalaryWorker1 = newSalaryWorker1 * 12;
        int annualNewSalaryWorker2 = newSalaryWorker2 * 12;
        int annualNewSalaryWorker3 = newSalaryWorker3 * 12;
        int deductionAnnualIncomeWorker1 = annualNewSalaryWorker1 - annualCurrentSalaryWorker1;
        int deductionAnnualIncomeWorker2 = annualNewSalaryWorker2 - annualCurrentSalaryWorker2;
        int deductionAnnualIncomeWorker3 = annualNewSalaryWorker3 - annualCurrentSalaryWorker3;

        System.out.println("Маша теперь получает " + newSalaryWorker1 + " рублей. Годовой доход вырос на " + deductionAnnualIncomeWorker1 + " рублей");
        System.out.println("Денис теперь получает " + newSalaryWorker2 + " рублей. Годовой доход вырос на " + deductionAnnualIncomeWorker2 + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryWorker3 + " рублей. Годовой доход вырос на " + deductionAnnualIncomeWorker3 + " рублей");
    }
}
