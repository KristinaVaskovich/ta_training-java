package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public abstract class Vegetable {
    int calories;
    int weight;

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public abstract String toString();
}
