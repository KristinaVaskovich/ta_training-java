package com.epam.training.student_kristina_vaskovich.collections.main_task;

import com.epam.training.student_kristina_vaskovich.collections.main_task.salad.Salad;
import com.epam.training.student_kristina_vaskovich.collections.main_task.util.FileReaderUtil;
import com.epam.training.student_kristina_vaskovich.collections.main_task.vegetables.*;

import java.util.Properties;

public class SaladMain {
    private static Properties property = FileReaderUtil.readPropertiesFile("src/main/resources/vegetablesInfo.properties");
    private static int cabbageWeight = Integer.parseInt(property.getProperty("cabbageWeight"));
    private static int cabbageCalories = Integer.parseInt(property.getProperty("cabbageCalories"));
    private static int carrotWeight = Integer.parseInt(property.getProperty("carrotWeight"));
    private static int carrotCalories = Integer.parseInt(property.getProperty("carrotCalories"));
    private static int cucumberWeight = Integer.parseInt(property.getProperty("cucumberWeight"));
    private static int cucumberCalories = Integer.parseInt(property.getProperty("cucumberCalories"));
    private static int onionWeight = Integer.parseInt(property.getProperty("onionWeight"));
    private static int onionCalories = Integer.parseInt(property.getProperty("onionCalories"));
    private static int tomatoWeight = Integer.parseInt(property.getProperty("tomatoWeight"));
    private static int tomatoCalories = Integer.parseInt(property.getProperty("tomatoCalories"));

    public static void main(String[] args) {
        Salad salad = new Salad();
        Vegetable cabbage = new Cabbage(cabbageCalories, cabbageWeight);
        Vegetable carrot = new Carrot(carrotCalories, carrotWeight);
        Vegetable cucumber = new Cucumber(cucumberCalories, cucumberWeight);
        Tomato tomato = new Tomato(tomatoCalories, tomatoWeight);
        Onion onion = new Onion(onionCalories, onionWeight);
        salad.addVegetable(cabbage);
        salad.addVegetable(carrot);
        salad.addVegetable(cucumber);
        salad.addVegetable(tomato);
        salad.addVegetable(onion);

        System.out.println("salad weight: " + salad.calculateSaladWeight());
        System.out.println("salad calories: " + salad.calculateSaladCalories());
        System.out.println("vegetables by calories from 10 to 35: " + salad.findVegetablesByCalories(10, 35).toString());
        System.out.println("vegetables by weight from 5 to 15: " + salad.findVegetablesByWeight(5, 15).toString());
        System.out.println("sorted by calories: " + salad.sortByCaloriesASC());
        System.out.println("sorted by weight: " + salad.sortByWeightASC());

    }
}
