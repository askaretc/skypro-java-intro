package pro.sky.java.course1.lesson1;

public class Program {
    public static void main(String[] args) {

        ////////// HOMEWORK 1 //////////
        System.out.println("HOMEWORK 1");

        ////////// Task 1 //////////
        System.out.println("\nTask 1:");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        ////////// Task 2 //////////
        System.out.println("\nTask 2:");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        ////////// Task 3 //////////
        System.out.println("\nTask 3:");
        dog -= 3;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        ////////// HOMEWORK 2 //////////
        System.out.println("\n\nHOMEWORK 2");

        ////////// Task 4 //////////
        System.out.println("\nTask 4:");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        ////////// Task 5 //////////
        System.out.println("\nTask 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        ////////// HOMEWORK 3 //////////
        System.out.println("\n\nHOMEWORK 3");

        ////////// Task 6 //////////
        System.out.println("\nTask 6:");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (firstBoxerWeight + secondBoxerWeight));
        System.out.println("Разница между весами бойцов: " + (secondBoxerWeight - firstBoxerWeight));

        ////////// Task 7 //////////
        System.out.println("\nTask 7:");
        System.out.println("Разница между весами бойцов (вычитание из большего веса меньшего): " + (secondBoxerWeight - firstBoxerWeight));
        System.out.println("Разница между весами бойцов (функция остаток от деления ): " + (secondBoxerWeight % firstBoxerWeight));

        ////////// Task 8 //////////
        System.out.println("\nTask 8:");
        // 1
        var workingHours = 640;
        var dailyHours = 8;
        var workers = workingHours / dailyHours;
        System.out.println("Всего работников в компании – " + workers + " человек");
        // 2
        var newWorkers = workers + 94;
        var newWorkingHours = newWorkers * dailyHours;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}
