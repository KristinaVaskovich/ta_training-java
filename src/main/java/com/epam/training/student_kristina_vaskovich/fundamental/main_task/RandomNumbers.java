package com.epam.training.student_kristina_vaskovich.fundamental.main_task;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of random numbers: ");
        int number = scanner.nextInt();
        System.out.println("Please, enter the bottom limit of random numbers: ");
        int bottom = scanner.nextInt();
        System.out.println("Please, enter the upper limit of random numbers: ");
        int upper = scanner.nextInt();

        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = bottom + (int) (Math.random() * upper);
        }
        for (int i : numbers) {
            System.out.println(i);
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
