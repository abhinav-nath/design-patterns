package com.codecafe.designpatterns.creational.abstractfactory.example2;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.factory.MealFactory;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;

public class Main {

  public static void main(String[] args) {
    MealFactory mealFactory = MealFactoryProducer.getMealFactory(MealTypes.INDIAN);
    Drink drink = mealFactory.createDrink();
    MainCourse mainCourse = mealFactory.createMainCourse();
    Side side = mealFactory.createSide();
    System.out.println(MealTypes.INDIAN + " meal is ready with:\n Drink - " + drink.getDrinkName()
      + "\n Main Course - " + mainCourse.getMainCourseName() + "\n Side - " + side.getSideName() + "\n");

    mealFactory = MealFactoryProducer.getMealFactory(MealTypes.JAPANESE);
    drink = mealFactory.createDrink();
    mainCourse = mealFactory.createMainCourse();
    side = mealFactory.createSide();
    System.out.println(MealTypes.JAPANESE + " meal is ready with:\n Drink - " + drink.getDrinkName()
      + "\n Main Course - " + mainCourse.getMainCourseName() + "\n Side - " + side.getSideName() + "\n");

    mealFactory = MealFactoryProducer.getMealFactory(MealTypes.ITALIAN);
    drink = mealFactory.createDrink();
    mainCourse = mealFactory.createMainCourse();
    side = mealFactory.createSide();
    System.out.println(MealTypes.ITALIAN + " meal is ready with:\n Drink - " + drink.getDrinkName()
      + "\n Main Course - " + mainCourse.getMainCourseName() + "\n Side - " + side.getSideName() + "\n");
  }

}