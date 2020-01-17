package com.designpatterns.builder.example2;

public class IndianMealBuilder implements MealBuilder {

	private Meal meal;

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