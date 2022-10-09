package com.codecafe.designpatterns.creational.builder.example3;

public class IndianMealBuilder implements MealBuilder {

  private final Meal meal;

  public IndianMealBuilder() {
    meal = new Meal();
  }

  @Override
  public void buildDrink() {
    meal.setDrink("Buttermilk");
  }

  @Override
  public void buildMainCourse() {
    meal.setMainCourse("Chicken Biryani");
  }

  @Override
  public void buildSide() {
    meal.setSide("Crispy Corn");
  }

  @Override
  public Meal getMeal() {
    return meal;
  }

}