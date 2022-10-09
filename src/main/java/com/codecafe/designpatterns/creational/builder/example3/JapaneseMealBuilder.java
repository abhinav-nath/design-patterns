package com.codecafe.designpatterns.creational.builder.example3;

public class JapaneseMealBuilder implements MealBuilder {

  private final Meal meal;

  public JapaneseMealBuilder() {
    meal = new Meal();
  }

  @Override
  public void buildDrink() {
    meal.setDrink("Sake");
  }

  @Override
  public void buildMainCourse() {
    meal.setMainCourse("Chicken Teriyaki");
  }

  @Override
  public void buildSide() {
    meal.setSide("Soup");
  }

  @Override
  public Meal getMeal() {
    return meal;
  }

}