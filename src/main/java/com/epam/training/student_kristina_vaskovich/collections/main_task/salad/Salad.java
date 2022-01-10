package com.epam.training.student_kristina_vaskovich.collections.main_task.salad;

import com.epam.training.student_kristina_vaskovich.collections.main_task.util.Finding;
import com.epam.training.student_kristina_vaskovich.collections.main_task.util.Sorting;
import com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables.Vegetable;
import java.util.*;

public class Salad implements Finding, Sorting {
    private List<Vegetable> salad;

    public Salad() {
        salad = new ArrayList<>();
    }

    public void addVegetable(Vegetable vegetable) {
        salad.add(vegetable);
    }

    public int calculateSaladWeight() {
        int weight = 0;
        for (Vegetable vegetable : salad) {
            weight += vegetable.getWeight();
        }
        return weight;
    }

    public int calculateSaladCalories() {
        int calories = 0;
        for (Vegetable vegetable : salad) {
            calories += vegetable.getCalories();
        }
        return calories;
    }

    @Override
    public List<Vegetable> findVegetablesByCalories(int caloriesFrom, int caloriesTo) {
        List<Vegetable> vegetablesByCalories = new ArrayList<>();
        for (Vegetable vegetable : salad) {
            if (vegetable.getCalories() > caloriesFrom && vegetable.getCalories() < caloriesTo) {
                vegetablesByCalories.add(vegetable);
            }
        }
        return vegetablesByCalories;
    }

    @Override
    public List<Vegetable> findVegetablesByWeight(int weightFrom, int weightTo) {
        List<Vegetable> vegetablesByWeight = new ArrayList<>();
        for (Vegetable vegetable : salad) {
            if (vegetable.getWeight() > weightFrom && vegetable.getWeight() < weightTo) {
                vegetablesByWeight.add(vegetable);
            }
        }
        return vegetablesByWeight;
    }

    @Override
    public List<Vegetable> sortByCaloriesASC() {
        salad.sort(Comparator.comparing(Vegetable::getCalories));
        return salad;
    }

    @Override
    public List<Vegetable> sortByWeightASC() {
        salad.sort(Comparator.comparing(Vegetable::getWeight));
        return salad;
    }
}
