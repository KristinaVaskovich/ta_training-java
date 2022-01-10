package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public class Tomato extends Vegetable {
    public Tomato(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
