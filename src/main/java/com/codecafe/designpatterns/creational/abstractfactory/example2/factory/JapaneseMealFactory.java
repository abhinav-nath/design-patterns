package com.codecafe.designpatterns.creational.abstractfactory.example2.factory;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Sake;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.ChickenTeriyaki;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Soup;

public class JapaneseMealFactory implements MealFactory {

  @Override
  public Drink createDrink() {
    Drink drink = new Sake();
    drink.setDrinkName();
    return drink;
  }

  @Override
  public MainCourse createMainCourse() {
    MainCourse mainCourse = new ChickenTeriyaki();
    mainCourse.setMainCourseName();
    return mainCourse;
  }

  @Override
  public Side createSide() {
    Side side = new Soup();
    side.setSideName();
    return side;
  }

}