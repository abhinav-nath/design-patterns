package com.codecafe.designpatterns.creational.builder.example1.telescopingconstructor;

public class Main {

  public static void main(String[] args) {

    NutritionFacts cocaCola = new NutritionFacts(200, 2);

    NutritionFacts pepsi = new NutritionFacts(240, 8, 100, 0, 35, 27);

  }

}