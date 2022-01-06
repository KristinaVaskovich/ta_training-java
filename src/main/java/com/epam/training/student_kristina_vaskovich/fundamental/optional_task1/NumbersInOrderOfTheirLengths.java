package com.epam.training.student_kristina_vaskovich.fundamental.optional_task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumbersInOrderOfTheirLengths {
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
        System.out.println("Numbers in ascending order of their lengths : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Numbers in descending order of their lengths : " + Arrays.toString(numbers));
    }
}
