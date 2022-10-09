package com.codecafe.designpatterns.creational.abstractfactory.example2;

import com.codecafe.designpatterns.creational.abstractfactory.example2.factory.IndianMealFactory;
import com.codecafe.designpatterns.creational.abstractfactory.example2.factory.ItalianMealFactory;
import com.codecafe.designpatterns.creational.abstractfactory.example2.factory.JapaneseMealFactory;
import com.codecafe.designpatterns.creational.abstractfactory.example2.factory.MealFactory;

public class MealFactoryProducer {

  public static MealFactory getMealFactory(MealTypes mealType) {

    return switch (mealType) {
      case INDIAN -> new IndianMealFactory();
      case ITALIAN -> new ItalianMealFactory();
      case JAPANESE -> new JapaneseMealFactory();
    };
  }

}