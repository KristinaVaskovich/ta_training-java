package com.epam.training.student_kristina_vaskovich.fundamental.main_task;

import java.util.Scanner;

public class ReverseArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter args: ");
        String string = scanner.nextLine();
        char[] reverseArray = string.toCharArray();
        System.out.println("Reversed args: ");
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
    }
}
