package com.epam.training.student_kristina_vaskovich.collections.optional_task;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PoemToListAndSortByLength {
    private static final String SONG =
            "I found a love for me\n" +
                    "Oh darling, just dive right in and follow my lead\n" +
                    "Well, I found a girl, beautiful and sweet\n" +
                    "Oh, I never knew you were the someone waiting for me\n" +
                    "'Cause we were just kids when we fell in love\n" +
                    "Not knowing what it was\n" +
                    "I will not give you up this time\n" +
                    "But darling, just kiss me slow, your heart is all I own\n" +
                    "And in your eyes, you're holding mine";

    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(SONG.split("\n"));
        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println("Arraylist after sorting: " + lines);
    }
}
