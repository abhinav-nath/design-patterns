package com.codecafe.designpatterns.creational.abstractfactory.example2.factory;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Buttermilk;
import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.ChickenBiryani;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.CrispyCorn;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;

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