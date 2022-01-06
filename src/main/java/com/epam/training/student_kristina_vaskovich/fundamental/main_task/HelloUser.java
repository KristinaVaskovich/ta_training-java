package com.epam.training.student_kristina_vaskovich.fundamental.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}


