package com.designpatterns.creational.abstractfactory.example2.factory;

import com.designpatterns.creational.abstractfactory.example2.drink.Drink;
import com.designpatterns.creational.abstractfactory.example2.drink.RedWine;
import com.designpatterns.creational.abstractfactory.example2.maincourse.MainCourse;
import com.designpatterns.creational.abstractfactory.example2.maincourse.Pizza;
import com.designpatterns.creational.abstractfactory.example2.side.Bread;
import com.designpatterns.creational.abstractfactory.example2.side.Side;

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