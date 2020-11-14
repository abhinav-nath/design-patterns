package com.designpatterns.creational.abstractfactory.example2;

import com.designpatterns.creational.abstractfactory.example2.factory.IndianMealFactory;
import com.designpatterns.creational.abstractfactory.example2.factory.ItalianMealFactory;
import com.designpatterns.creational.abstractfactory.example2.factory.JapaneseMealFactory;
import com.designpatterns.creational.abstractfactory.example2.factory.MealFactory;

public class MealFactoryProducer {

    public static MealFactory getMealFactory(MealTypes mealType) {

        if (MealTypes.INDIAN.equals(mealType)) {
            return new IndianMealFactory();
        } else if (MealTypes.ITALIAN.equals(mealType)) {
            return new ItalianMealFactory();
        }
        if (MealTypes.JAPANESE.equals(mealType)) {
            return new JapaneseMealFactory();
        }
        return null;
    }
}