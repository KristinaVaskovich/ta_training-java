package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public class Cucumber extends Vegetable{
    public Cucumber(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
