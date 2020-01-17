package com.designpatterns.builder.example2;

public interface MealBuilder {

	public void buildDrink();
	public void buildMainCourse();
	public void buildSide();
	public Meal getMeal();
	
}