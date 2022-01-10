package com.epam.training.student_kristina_vaskovich.collections.optional_task;

import java.io.File;
import java.util.ArrayList;

public class DirectoryAndSubdirectories {
    public static ArrayList<String> writeToList(String pathName) {
        File directory = new File(pathName);
        ArrayList<String> catalogElements = new ArrayList<>();
        if (directory.isDirectory()) {
            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {
                    catalogElements.add(item.getName() + " - folder");
                } else {
                    catalogElements.add(item.getName() + " - file");
                }
            }
        }
        return catalogElements;
    }

    public static void main(String[] args) {
        System.out.println("All catalog elements: ");
        System.out.println(writeToList("C:\\Users\\User\\Desktop\\1level").toString());
    }
}
