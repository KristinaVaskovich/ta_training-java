package com.epam.training.student_kristina_vaskovich.collections.optional_task;

import java.io.*;
import java.util.ArrayList;

public class StringsFromFileInDescOrder {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        File input = new File("src/main/resources/inputStrings.txt");
        File output = new File("src/main/resources/outputStringsDescOrder.txt");
        String string = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
            string = bufferedReader.readLine();
            while (string != null) {
                arrayList.add(string);
                string = bufferedReader.readLine();
            }
        }
        System.out.println("ArrayList from file: ");
        System.out.println(arrayList.toString());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                String text = arrayList.get(i);
                bw.write(text + "\n");
            }
        }
        System.out.println("Strings written to new file in desc order!");
    }
}
