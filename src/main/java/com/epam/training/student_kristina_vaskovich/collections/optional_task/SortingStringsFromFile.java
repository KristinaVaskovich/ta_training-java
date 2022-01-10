package com.epam.training.student_kristina_vaskovich.collections.optional_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortingStringsFromFile {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        File input = new File("src/main/resources/inputStrings.txt");
        String string = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
            string = bufferedReader.readLine();
            if (string == null) {
                System.out.println("File is empty!");
            } else {
                while (string != null) {
                    arrayList.add(string);
                    string = bufferedReader.readLine();
                }
            }
        } catch (IOException ioException) {
            System.out.println("I/O Error: " + ioException);
        }
        System.out.println("ArrayList from file: ");
        System.out.println(arrayList.toString());
        System.out.println("Sorted arrayList from file: ");
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList.toString());
    }
}
