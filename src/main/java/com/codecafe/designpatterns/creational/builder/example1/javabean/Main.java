package com.codecafe.designpatterns.creational.builder.example1.javabean;

public class Main {

  public static void main(String[] args) {

    NutritionFacts cocaCola = new NutritionFacts();

    cocaCola.setServings(240);
    cocaCola.setServings(8);
    cocaCola.setCalories(100);
    cocaCola.setSodium(35);
    cocaCola.setCarbohydrate(27);

  }

}