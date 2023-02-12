package pro.sky.java.course1.additional.task6;

import java.util.Random;

public class Program {
    public static void main(String[] args) {

        /////////// Task 6 //////////
        System.out.println("Task 6:");

        int[] arr = generateRandomArray();
        printAverageSum(arr);
    }

    public static void printAverageSum (int[] arr) {
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", calculateAverageSum(arr));
    }

    private static int calculateTotalSum (int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        return totalSum;
    }

    private static double calculateAverageSum (int[] arr) {
        return (double) calculateTotalSum(arr) / arr.length;
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
