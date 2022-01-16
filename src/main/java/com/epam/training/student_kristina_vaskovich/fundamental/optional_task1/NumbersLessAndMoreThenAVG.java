package com.epam.training.student_kristina_vaskovich.fundamental.optional_task1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersLessAndMoreThenAVG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the count of random numbers : ");
        int count = scanner.nextInt();
        Long[] numbers = new Long[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Please, enter the number : ");
            numbers[i] = scanner.nextLong();
        }
        int sumOfLength = 0;
        for (long number : numbers) {
            sumOfLength += Long.toString(number).length();
        }
        long avg = sumOfLength / count;
        System.out.println("Avg number : " + avg);
        ArrayList<Long> lessThenAvg = new ArrayList();
        ArrayList<Long> moreThenAvg = new ArrayList();
        for (Long number : numbers) {
            if (Long.toString(number).length() < avg) {
                lessThenAvg.add(number);
            }
            if (Long.toString(number).length() > avg) {
                moreThenAvg.add(number);
            }
        }
        System.out.println("Numbers less then avg and their length:");
        for (Long longLessThenAvg : lessThenAvg) {
            System.out.println("number: " + longLessThenAvg + " length: " + Long.toString(longLessThenAvg).length());
        }
        System.out.println("Numbers more then avg and their length:");
        for (Long longMoreThenAvg : moreThenAvg) {
            System.out.println("number: " + longMoreThenAvg + " length: " + Long.toString(longMoreThenAvg).length());
        }
    }
}
