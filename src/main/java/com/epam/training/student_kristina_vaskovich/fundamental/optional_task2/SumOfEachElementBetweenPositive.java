package com.epam.training.student_kristina_vaskovich.fundamental.optional_task2;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEachElementBetweenPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of matrix elements : ");
        int number = scanner.nextInt();
        System.out.println("Please, enter the upper border of the digits : ");
        int border = scanner.nextInt();
        int[][] matrix = new int[number][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * border * 2) - border;
            }
        }
        System.out.println("Random matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        int sum = 0;
        int firstNumberIndex = 0;
        int secondNumberIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    firstNumberIndex = j;
                    break;
                }
            }
            for (int k = firstNumberIndex + 1; k < matrix[i].length; k++) {
                if (matrix[i][k] > 0) {
                    secondNumberIndex = k;
                    break;
                }
            }
            firstNumberIndex++;
            for (int g = firstNumberIndex; g < secondNumberIndex; g++) {
                if (firstNumberIndex == secondNumberIndex) {
                    break;
                }
                sum = sum + matrix[i][g];
            }
        }
        System.out.println("The sum of numbers between first positives (not including this numbers): " + sum);
    }
}
