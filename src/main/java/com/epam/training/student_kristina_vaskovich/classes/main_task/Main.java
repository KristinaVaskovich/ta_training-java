package com.epam.training.student_kristina_vaskovich.classes.main_task;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Иванов");
        Student student2 = new Student(2, "Петров");
        Student student3 = new Student(3, "Факультет №1", "Курс №1", "Группа №1");
        Student student4 = new Student(4, "Факультет №1", "Курс №2", "Группа №2");
        Student student5 = new Student(5, "Факультет №2", "Курс №1", "Группа №5");
        Student student6 = new Student(6, "Факультет №2", "Курс №2", "Группа №5");
        Student student7 = new Student(7, "Факультет №2", "Курс №3", "Группа №6");
        Student student8 = new Student(8, "Факультет №3", "Курс №1", "Группа №7");
        Student student9 = new Student(9, "Сидоров", "Иван", "Иванович",
                new Date(90, 4, 5), "ул.Первая, 1", 802987,
                "Факультет №5", "Курс №1", "Группа №6");
        Student student10 = new Student(10, "Сидоров", "Петр", "Иванович",
                new Date(91, 4, 5), "ул.Первая, 1", 802987,
                "Факультет №5", "Курс №1", "Группа №6");

        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);
        listOfStudents.add(student7);
        listOfStudents.add(student8);
        listOfStudents.add(student9);
        listOfStudents.add(student10);

        System.out.println("List od students of faculty №3 : ");
        Student.listOfStudentsOfFaculty(listOfStudents, "Факультет №3").forEach(System.out::println);
        System.out.println();

        System.out.println("List od students of faculty №5 and course №1: ");
        Student.listOfStudentsOfFacultyAndCourse(listOfStudents, "Факультет №5", "Курс №1").
                forEach(System.out::println);
        System.out.println();

        System.out.println("List od students who were born after 01.01.89: ");
        Student.listOfStudentsWhoWereBornAfterDate(listOfStudents, new Date(89, 1, 1)).
                forEach(System.out::println);
        System.out.println();

        System.out.println("List od students of group №5: ");
        Student.listOfStudentsOfGroup(listOfStudents, "Группа №5").forEach(System.out::println);
    }
}
