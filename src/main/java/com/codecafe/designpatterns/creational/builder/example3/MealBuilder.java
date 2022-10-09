package com.codecafe.designpatterns.creational.builder.example3;

public interface MealBuilder {

  void buildDrink();

  void buildMainCourse();

  void buildSide();

  Meal getMeal();

}