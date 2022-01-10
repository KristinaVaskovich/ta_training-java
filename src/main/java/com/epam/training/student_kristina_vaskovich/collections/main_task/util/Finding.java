package com.epam.training.student_kristina_vaskovich.collections.main_task.util;

import com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables.Vegetable;

import java.util.List;

public interface Finding {
    List<Vegetable> findVegetablesByCalories(int caloriesFrom, int caloriesTo);

    List<Vegetable> findVegetablesByWeight(int weightFrom, int weightTo);
}
