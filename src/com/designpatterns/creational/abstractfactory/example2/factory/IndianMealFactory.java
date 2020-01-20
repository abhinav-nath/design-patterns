package com.designpatterns.creational.abstractfactory.example2.factory;

import com.designpatterns.creational.abstractfactory.example2.drink.Buttermilk;
import com.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.designpatterns.creational.abstractfactory.example2.maincourse.ChickenBiryani;
import com.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.designpatterns.creational.abstractfactory.example2.side.CrispyCorn;
import com.designpatterns.creational.abstractfactory.example2.side.Side;

public class IndianMealFactory implements MealFactory {

	@Override
	public Drink createDrink() {
		Drink drink = new Buttermilk();
		drink.setDrinkName();
		return drink;
	}

	@Override
	public MainCourse createMainCourse() {
		MainCourse mainCourse = new ChickenBiryani();
		mainCourse.setMainCourseName();
		return mainCourse;
	}

	@Override
	public Side createSide() {
		Side side = new CrispyCorn();
		side.setSideName();
		return side;
	}

}