package com.epam.training.student_kristina_vaskovich.fundamental.optional_task1;

import java.util.Arrays;
import java.util.Scanner;

public class LongestAndShortestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of random numbers : ");
        int number = scanner.nextInt();
        Integer[] numbers = new Integer[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Please, enter the number : ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Longest number : " + numbers[numbers.length - 1] + ", length is : " + Integer.toString(numbers[numbers.length - 1]).length());
        System.out.println("Shortest number : " + numbers[0] + ", length is : " + Integer.toString(numbers[0]).length());
    }
}