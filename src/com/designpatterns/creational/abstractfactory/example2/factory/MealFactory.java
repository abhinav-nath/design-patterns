package com.designpatterns.creational.abstractfactory.example2.factory;

import com.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.designpatterns.creational.abstractfactory.example2.side.Side;

public interface MealFactory {
	public Drink createDrink();
	public MainCourse createMainCourse();
	public Side createSide();
}