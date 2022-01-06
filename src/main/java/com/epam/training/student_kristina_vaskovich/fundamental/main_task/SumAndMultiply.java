package com.epam.training.student_kristina_vaskovich.fundamental.main_task;

import java.util.Scanner;

public class SumAndMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of random numbers : ");
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < number; i++) {
            System.out.println("Please, enter the number : ");
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
            mul = mul * numbers[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + mul);
    }
}
