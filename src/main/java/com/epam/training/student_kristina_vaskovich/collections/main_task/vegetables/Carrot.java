package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public class Carrot extends Vegetable {
    public Carrot(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Carrot{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
