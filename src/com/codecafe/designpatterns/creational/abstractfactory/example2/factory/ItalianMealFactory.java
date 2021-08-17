package com.codecafe.designpatterns.creational.abstractfactory.example2.factory;

import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.codecafe.designpatterns.creational.abstractfactory.example2.drink.RedWine;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.codecafe.designpatterns.creational.abstractfactory.example2.maincourse.Pizza;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Bread;
import com.codecafe.designpatterns.creational.abstractfactory.example2.side.Side;

public class ItalianMealFactory implements MealFactory {

    @Override
    public Drink createDrink() {
        Drink drink = new RedWine();
        drink.setDrinkName();
        return drink;
    }

    @Override
    public MainCourse createMainCourse() {
        MainCourse mainCourse = new Pizza();
        mainCourse.setMainCourseName();
        return mainCourse;
    }

    @Override
    public Side createSide() {
        Side side = new Bread();
        side.setSideName();
        return side;
    }

}