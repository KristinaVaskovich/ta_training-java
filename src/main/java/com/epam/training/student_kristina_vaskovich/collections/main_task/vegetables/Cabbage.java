package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public class Cabbage extends Vegetable {
    public Cabbage(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cabbage{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
