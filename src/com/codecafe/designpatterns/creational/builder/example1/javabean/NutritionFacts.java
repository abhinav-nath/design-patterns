package com.codecafe.designpatterns.creational.builder.example1.javabean;

public class NutritionFacts {

    // Parameters initialized to default values (if any)
    private int servingSize = -1;      // (mL)                 required
    private int servings = -1;         // (per container)      required
    private int calories = 0;          // (per serving)        optional
    private int fat = 0;               // (g/serving)          optional
    private int sodium = 0;            // (mg/serving)         optional
    private int carbohydrate = 0;      // (g/serving)          optional

    public NutritionFacts() {

    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

}