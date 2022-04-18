package com.codecafe.designpatterns.creational.builder.example3;

public class ItalianMealBuilder implements MealBuilder {

  private Meal meal;

  public ItalianMealBuilder() {
    meal = new Meal();
  }

  @Override
  public void buildDrink() {
    meal.setDrink("Red Wine");
  }

  @Override
  public void buildMainCourse() {
    meal.setMainCourse("Pizza");
  }

  @Override
  public void buildSide() {
    meal.setSide("Bread");
  }

  @Override
  public Meal getMeal() {
    return meal;
  }

}