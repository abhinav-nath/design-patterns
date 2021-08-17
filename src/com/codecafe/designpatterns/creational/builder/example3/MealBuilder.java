package com.codecafe.designpatterns.creational.builder.example3;

public interface MealBuilder {

    public void buildDrink();

    public void buildMainCourse();

    public void buildSide();

    public Meal getMeal();

}