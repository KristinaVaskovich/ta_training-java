package com.epam.training.student_kristina_vaskovich.fundamental.optional_task1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersLessAndMoreThenAVG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of random numbers : ");
        int number = scanner.nextInt();
        Long[] numbers = new Long[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Please, enter the number : ");
            numbers[i] = scanner.nextLong();
        }
        int sumOfLength = 0;
        for (long n : numbers) {
            sumOfLength += Long.toString(n).length();
        }
        long avg = sumOfLength / number;
        System.out.println("Avg number : " + avg);
        ArrayList<Long> lessThenAvg = new ArrayList();
        ArrayList<Long> moreThenAvg = new ArrayList();
        for (Long n : numbers) {
            if (Long.toString(n).length() < avg) {
                lessThenAvg.add(n);
            }
            if (Long.toString(n).length() > avg) {
                moreThenAvg.add(n);
            }
        }
        System.out.println("Numbers less then avg and their length:");
        for (Long i : lessThenAvg) {
            System.out.println("number: " + i + " length: " + Long.toString(i).length());
        }
        System.out.println("Numbers more then avg and their length:");
        for (Long i : moreThenAvg) {
            System.out.println("number: " + i + " length: " + Long.toString(i).length());
        }
    }
}
