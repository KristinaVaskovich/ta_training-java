package com.epam.training.student_kristina_vaskovich.fundamental.optional_task1;

import java.util.Scanner;

public class NumberWithDifferentChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of random numbers : ");
        int number = scanner.nextInt();
        Long[] numbers = new Long[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Please, enter the number : ");
            numbers[i] = scanner.nextLong();
        }
        for (Long n : numbers) {
            boolean isDistinct = true;
            char[] chars = String.valueOf(Math.abs(n)).toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (!isDistinct) {
                    break;
                } else if (i == chars.length - 2) {
                    System.out.println("First number with different chars : " + n);
                    return;
                }
            }
        }
        System.out.println("There are no distinct numbers");
    }
}
