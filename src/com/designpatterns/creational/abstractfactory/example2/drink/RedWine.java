package com.designpatterns.creational.abstractfactory.example2.drink;

public class RedWine implements Drink {

    private String drinkName = null;

    @Override
    public void setDrinkName() {
        drinkName = "Red Wine";
    }

    @Override
    public String getDrinkName() {
        return drinkName;
    }
}