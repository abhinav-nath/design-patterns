package com.codecafe.designpatterns.creational.abstractfactory.example2.factory;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;

public interface MealFactory {

  Drink createDrink();

  MainCourse createMainCourse();

  Side createSide();

}