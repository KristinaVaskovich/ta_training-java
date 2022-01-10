package com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables;

public class Onion extends Vegetable{
    public Onion(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Onion{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
