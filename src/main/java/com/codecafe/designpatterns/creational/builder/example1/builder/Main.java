package com.codecafe.designpatterns.creational.builder.example1.builder;

public class Main {

  public static void main(String[] args) {

    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    NutritionFacts pepsi = new NutritionFacts.Builder(200, 2).calories(100).fat(20).build();

  }

}