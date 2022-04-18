package com.codecafe.designpatterns.creational.abstractfactory.example2.factory;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;

public interface MealFactory {
  public Drink createDrink();

  public MainCourse createMainCourse();

  public Side createSide();
}