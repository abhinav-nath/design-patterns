package com.codecafe.designpatterns.creational.builder.example1.builder;

public class NutritionFacts {

  private final int servingSize;      // (mL)                 required
  private final int servings;         // (per container)      required
  private final int calories;         // (per serving)        optional
  private final int fat;              // (g/serving)          optional
  private final int sodium;           // (mg/serving)         optional
  private final int carbohydrate;     // (g/serving)          optional


  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }

  public static class Builder {

    // Required Parameters
    private final int servingSize;
    private final int servings;

    // Optional Parameters - initialized to default values
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      calories = val;
      return this;
    }

    public Builder fat(int val) {
      fat = val;
      return this;
    }

    public Builder sodium(int val) {
      sodium = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      carbohydrate = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

  }

}